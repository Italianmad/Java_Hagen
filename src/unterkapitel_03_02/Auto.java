package unterkapitel_03_02;

public class Auto {
	public String firma;
	public int geschwindigkeit;
	public int leistung;
	
	public Auto() {
		firma = "unbekannt";
		geschwindigkeit = 0;// construtor is the place were define the variables.
		leistung = 50;
	}
	public Auto(String n, int g, int p) {
		firma = n;
		geschwindigkeit = g;// costrutor is the place were define the variables.
		leistung = p;
	}
	
	public Auto(String m) {
		firma = m;
		geschwindigkeit = 0;// costrutor is the place were define the variables.
		leistung = 50;
	}
	
	
	
	public void bremsen() {
		geschwindigkeit -= 10;
		if (geschwindigkeit > 0) geschwindigkeit = 0;
		
	}
	
	
	public void beschleunigen() {
		geschwindigkeit += 10;
		if (geschwindigkeit > 180) geschwindigkeit = 180;
	}
	

}

class Motorrad{
public static int anzahlMotorraeder;
public static int anzahl;
public int tempo = 20;
}
