package facade;

public class Amplifier {
	
	public String on() {
		String result = ", amplifier on";
		
		return result;
	}
	
	public String off() {
		String result = ", amplifier off";
		
		return result;
	}
	
	public String setVolume(int volume) {
		String result = ", volume " + volume;
		
		return result;
	}

}
