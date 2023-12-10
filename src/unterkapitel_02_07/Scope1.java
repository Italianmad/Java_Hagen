package unterkapitel_02_07;

public class Scope1 {
	private int wert;
	public static void main (String args[]) {
		Scope1 objekt = new Scope1();
		objekt.wert= 10;
		duckerWert();
	}
	
	public static void duckerWert() {
		Scope1 objekt = new Scope1();
		objekt.wert= 5;
		System.out.println("Der Wert ist "+ objekt.wert);
	}
}
