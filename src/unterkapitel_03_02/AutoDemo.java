package unterkapitel_03_02;

import unterkapitel_03_02.Auto;

public class AutoDemo {
	public static void main (String [] args) {
	Auto a = new Auto(); // Default constructor;
	System.out.println("Marke des neuen Autos: "+ a.firma);
	Auto b = new Auto("BWM"); // Another constructor;
	System.out.println("Marke des neuen Autos: "+ b.firma);
	Auto c = new Auto("Volkswagen", 120,180);
	System.out.println("Marke des neuen Autos: "+ c.firma);
	Motorrad d = new Motorrad();
	System.out.println("Tempo des neuen Autos: "+ d.tempo);
	Motorrad e = new Motorrad();
	e.tempo= 56;
	System.out.println("Tempo des neuen Autos: "+ e.tempo);
	Motorrad f = new Motorrad();
	System.out.println("Die Anzahl der Motorraeder des neuen Autos: "+ f.anzahlMotorraeder);
	}
}
