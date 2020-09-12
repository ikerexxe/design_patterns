package facade;

public class MediaPlayer {
	
	public String on() {
		String result = ", media player on";
		
		return result;
	}
	
	public String off() {
		String result = ", media player off";
		
		return result;
	}
	
	public String play(String movie) {
		String result = ", play " + movie;
		
		return result;
	}

}
