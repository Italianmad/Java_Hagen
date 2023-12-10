package unterkapitel_02_06;

public class GroessteZahl {
	public static void main (String args[]) {
		int [] zahlen = {33,55,-100,50,500,-13};
		int groessteZahl = zahlen[0];
		for(int zahl : zahlen) {
			if(zahl > groessteZahl) {
				groessteZahl = zahl;
			}
			
		String[] jahreszeiten = {"Frühling", "Sommer", "Herbst", "Winter"};	
		int counter = 0;
		for(String jahreszeit : jahreszeiten) {
			if (counter==jahreszeiten.length) {
				break;}
			System.out.println(jahreszeit);
			counter++;
			
			
		 }
		}
		System.out.println("Größte Zahl: " + groessteZahl);
			
	}
		
}

