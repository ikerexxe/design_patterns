package facade;

public class HomeTheaterFacade {
	
	Projector projector;
	Amplifier amplifier;
	MediaPlayer mediaPlayer;
	
	public HomeTheaterFacade(Projector projector, Amplifier amplifier, MediaPlayer mediaPlayer) {
		this.projector = projector;
		this.amplifier = amplifier;
		this.mediaPlayer = mediaPlayer;
	}
	
	public String watchMovie(String movie) {
		String result;
		String projectorResult;
		String amplifierResult;
		String mediaPlayerResult;
		String welcome = "System ready";
		
		projectorResult = projector.on();
		amplifierResult = amplifier.on();
		amplifierResult += amplifier.setVolume(5);
		mediaPlayerResult = mediaPlayer.on();
		mediaPlayerResult += mediaPlayer.play(movie);
		
		result = welcome + projectorResult + amplifierResult + mediaPlayerResult;
		
		System.out.print(result);
		
		return result;
	}
	
	public String endMovie() {
		String result;
		String projectorResult;
		String amplifierResult;
		String mediaPlayerResult;
		String goodBye = "System going to off";
		
		projectorResult = projector.off();
		amplifierResult = amplifier.off();
		mediaPlayerResult = mediaPlayer.off();
		
		result = goodBye + projectorResult + amplifierResult + mediaPlayerResult;
		
		System.out.print(result);
		
		return result;
	}

}
