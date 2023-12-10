package unterkapitel_02_05;

public class Endlosschleife2 {

	public static void main (String args []) {

		long basis = 13;
		int exponent = 6;
		long ergebnis = 1;
		
		System.out.print (basis + " hoch " + exponent + " ergibt ");
		
		while (exponent > 0) {
		
			ergebnis *= basis;
			exponent--;
		
		}
		
		System.out.println (ergebnis);
		
	}

}
