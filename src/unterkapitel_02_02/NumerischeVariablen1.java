package unterkapitel_02_02;

public class NumerischeVariablen1 {
	public static void main (String args []) {
		
		short aeltesterMensch = 128; //  from -128 to 127 
		short entfernungKoelnMuenchenInKm = 577;
		short deutschlandAustralienInKm = 16000;
		int erdeSonneInKm = 149600000; // from -2.147.483.648 and +2.147.483.647
		long lichtjahrInKm = 9500000000000L;
		
		System.out.println ("Der älteste Mensch wurde "+ aeltesterMensch +" Jahre alt.");
		
		System.out.println ("Zwischen Deutschland und Australien liegen etwa "+ deutschlandAustralienInKm +" km.");
		 
		System.out.println ("Zwischen der Erde und der Sonne liegen etwa " + erdeSonneInKm +" km.");
	
		System.out.println ("Ein Lichtjahr misst "+ lichtjahrInKm +" km.");
		
		System.out.println ("Zwischen Koeln und Muenchen liegen etwa " + entfernungKoelnMuenchenInKm +" km.");
	}
}
