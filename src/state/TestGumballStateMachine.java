package state;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestGumballStateMachine {
	
	GumballStateMachine gumballStateMachine;
	
	@BeforeEach
	void givenGumballIsCreatedWithOneBall() {
		gumballStateMachine = new GumballStateMachine(1);
	}

	@Test
	void whenQuarterIsEjected_thenNothingHappens() {
		String actualResult;
		String expectedResult = "You haven't inserted a quarter.";
		
		actualResult = gumballStateMachine.ejectQuarter();
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenCrankIsTurned_thenNothingHappens() {
		String actualResult;
		String expectedResult = "You turned the crank, but there's no quarter. You need to pay.";
		
		actualResult = gumballStateMachine.turnCrank();
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenQuarterIsInserted_thenMachineHasAQuarter() {
		String actualResult;
		String expectedResult = "You inserted a quarter.";
		
		actualResult = gumballStateMachine.insertQuarter();
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenQuarterIsInsertedAndAnotherQuarterIsInserted_thenMachineShowsWarning() {
		String actualResult;
		String expectedResult = "You can't insert another quarter.";
		
		gumballStateMachine.insertQuarter();
		actualResult = gumballStateMachine.insertQuarter();
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenQuarterIsInsertedAndEjected_thenMachineHasNoQuarter() {
		String actualResult;
		String expectedResult = "Quarter ejected.";
		
		gumballStateMachine.insertQuarter();
		actualResult = gumballStateMachine.ejectQuarter();
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenQuarterIsInsertedAndCrankIsTurned_thenMachineIsGoingToSell() {
		String actualResult;
		String expectedResult = "You turned the crank... A gumball comes rolling out of the slot...";
		
		gumballStateMachine.insertQuarter();
		actualResult = gumballStateMachine.turnCrank();
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenThereIsNoBallAndQuarterIsInserted_thenMachineShowsWarning() {
		String actualResult;
		String expectedResult = "You inserted a quarter but nothing will happen.";
		
		gumballStateMachine.setCount(0);
		actualResult = gumballStateMachine.insertQuarter();
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenThereIsNoBallAndQuarterIsEjected_thenMachineShowsWarning() {
		String actualResult;
		String expectedResult = "You ejected a quarter but nothing will happen.";
		
		gumballStateMachine.setCount(0);
		actualResult = gumballStateMachine.ejectQuarter();
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenThereIsNoBallAndCrankIsTurned_thenMachineShowsWarning() {
		String actualResult;
		String expectedResult = "You turned the crank but nothing will happen. The machine is empty nothing can be dispensed.";
		
		gumballStateMachine.setCount(0);
		actualResult = gumballStateMachine.turnCrank();
		
		assertEquals(expectedResult, actualResult);
	}

}
