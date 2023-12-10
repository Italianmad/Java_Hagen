package unterkapitel_03_01;

public class Auto {
	
	public String firma;
	public String farbe;
	public int geschwindigkeit;
	public int leistung;
	
	
	public void bremsen() {
		geschwindigkeit -=10;
		if (geschwindigkeit>0) geschwindigkeit=0;
		
	};
	
	
	public void beschleunigen() {
		geschwindigkeit +=10;
		if (geschwindigkeit>180) geschwindigkeit=180;
	};
	public static void main (String args[]) {
		
		
	}
}
