package unterkapitel_02_07;

public class Methodenaufrufe {
	public static void main (String args[]) {
		System.out.println("Aufruf der println-Methode!");
		System.out.println("Eine Zahl zwischen 1 und 100 der Math.random()-Methode: "+ (1 + (int)(Math.random() * 100.0)));
		System.out.println("Sinus: "+Math.sin(3.141592)*2);
		// int a = 2*System.out.println ("Hallo Welt");
		int alterInJahren = 43;
		System.out.println("Ihr Alter in Tagen: "+(alterInJahren*365)); // Argumente (alterInJahren*365)
		
		double a = 8;
		double c = Math.hypot(a-2, a);
		System.out.print("Hypotenuse: "+c);
	}
}


