package facade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHomeTheaterFacade {
	
	HomeTheaterFacade homeTheater;
	
	@BeforeEach
	void SetUp() {
		Projector projector = new Projector();
		Amplifier amplifier = new Amplifier();
		MediaPlayer mediaPlayer = new MediaPlayer();
		
		homeTheater = new HomeTheaterFacade(projector, amplifier, mediaPlayer);
	}

	@Test
	void whenHomeTheaterWatchMovie_thenProjectorAmplifierAndMediaPlayerGetReady() {
		String actualResult;
		String movie = "Indiana Jones";
		String expectedResult = "System ready, projector on, amplifier on,"
				+ " volume 5, media player on, play " + movie;
		
		actualResult = homeTheater.watchMovie(movie);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void whenHomeTheaterEndMovie_thenProjectorAmplifierAndMediaPlayerGoOff() {
		String actualResult;
		String expectedResult = "System going to off, projector off,"
				+ " amplifier off, media player off";
		
		actualResult = homeTheater.endMovie();
		
		assertEquals(expectedResult, actualResult);
	}

}
