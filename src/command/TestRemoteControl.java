package command;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestRemoteControl {
	
	RemoteControl remoteControl;
	
	String livingRoomLightName = "Living room";
	String kitchenLightName = "Kitchen";
	String ceilingFanName = "Ceiling";
	
	@BeforeEach
	void SetUp() {
		remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light(livingRoomLightName);
		Light kitchenLight = new Light(kitchenLightName);
		Fan ceilingFan = new Fan(ceilingFanName);
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		FanOnCommand ceilingFanOn = new FanOnCommand(ceilingFan);
		FanOffCommand ceilingFanOff = new FanOffCommand(ceilingFan);
		
		remoteControl.setCommand(livingRoomLightName, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(kitchenLightName, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(ceilingFanName, ceilingFanOn, ceilingFanOff);
	}

	@Test
	void whenLivingRoomLightIsPushedOn_thenLivingRoomLightIsSwitchedOn() {
		String result = remoteControl.onButtonIsPushed(livingRoomLightName);
		
		assertEquals(result, livingRoomLightName + " light switched on");
	}
	
	@Test
	void whenKitchenLightIsPushedOn_thenKitchenLightIsSwitchedOn() {
		String result = remoteControl.onButtonIsPushed(kitchenLightName);
		
		assertEquals(result, kitchenLightName + " light switched on");
	}
	
	@Test
	void whenCeilingFanIsPushedOff_thenCeilingFanIsSwitchedOff() {
		String result = remoteControl.offButtonIsPushed(ceilingFanName);
		
		assertEquals(result, ceilingFanName + " fan switched off");
	}
	
	@Test
	void whenAllArePushedOnAndThenOff_thenAllAreIsSwitchedOnAndThenOff() {
		String resultLivingOn = remoteControl.onButtonIsPushed(livingRoomLightName);
		String resultKitchenOn = remoteControl.onButtonIsPushed(kitchenLightName);
		String resultCeilingOn = remoteControl.onButtonIsPushed(ceilingFanName);
		String resultLivingOff = remoteControl.offButtonIsPushed(livingRoomLightName);
		String resultKitchenOff = remoteControl.offButtonIsPushed(kitchenLightName);
		String resultCeilingOff = remoteControl.offButtonIsPushed(ceilingFanName);
		
		assertEquals(resultLivingOn, livingRoomLightName + " light switched on");
		assertEquals(resultKitchenOn, kitchenLightName + " light switched on");
		assertEquals(resultCeilingOn, ceilingFanName + " fan switched on");
		assertEquals(resultLivingOff, livingRoomLightName + " light switched off");
		assertEquals(resultKitchenOff, kitchenLightName + " light switched off");
		assertEquals(resultCeilingOff, ceilingFanName + " fan switched off");
	}

}
