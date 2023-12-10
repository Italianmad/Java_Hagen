package unterkapitel_03_09;

public class Lampedemo1 {
	public static void main (String args[]) {
		Lampe L1,L2;
		L1 = new Lampe();
		L1.schalteAus();
		L2 = new Lampe(true);
		

		System.out.println("Zustand von L1:");
		L1.zeigeZustand();
		
		System.out.println("Zustand von L2:");
		L2.zeigeZustand();
		
	}
}
