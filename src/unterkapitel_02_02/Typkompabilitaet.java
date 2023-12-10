package unterkapitel_02_02;

public class Typkompabilitaet {
	public static void main (String args[]) {
		int anzahlArtikel = 120;
		float kostenProArtikel = 13.99f;
		float gesamtkosten = anzahlArtikel * kostenProArtikel; // int*float
		
		System.out.print("Gesamtpreis"+gesamtkosten);
		// byte ➔ short ➔ int ➔ long ➔ float ➔ double
	}

}
