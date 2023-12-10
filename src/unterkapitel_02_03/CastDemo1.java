package unterkapitel_02_03;

public class CastDemo1 {
	public static void main (String args []) {
		float kommazahl = 37.7f;
		int ganzzahl = (int)kommazahl;
		
		System.out.println("Kommazahl: "+ kommazahl);
		System.out.println("Ganzzahl: "+ ganzzahl);
		
		float f = (float)12.123456789;
		long l = (long)f;
		int i = (int)l;
		short s = (byte)i; // byte can be saved inside short. Cast for char and elementary datatyp
		System.out.println("Zahlen: "+ f +" "+ l +" "+ i +" "+ s);
	}

}
