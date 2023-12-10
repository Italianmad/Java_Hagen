package unterkapitel_03_07;

public class intforHaus {
	public static void main (String [] args) {
		Haus meinDomizil = new Holzhuette();
		Hausboot yacht = new Hausboot(4,80,false);
		Boat destroyedboat = yacht;
		//Haus destroyedhaus = yacht;
		
		
		infoFuerHaus(meinDomizil);
		infoFuerHaus(destroyedboat);
		infoFuerHaus(yacht);
		//infoFuerHaus(destroyedhaus);
		
	}
		

	// method for the Hausboot it inherts form Haus
		public static void infoFuerHaus(Haus c) {
			System.out.println("Das Haus hat das Garten? [true/false] "+ c.mitGarden());
			System.out.println("Wie viel Zimmer hat das Haus? [1-10] "+ c.liefereAnzahlZimmer());
			System.out.println();
			}
		
		public static void infoFuerHaus(Boat c) {
			System.out.println("Wie viele Tiefgaenge hat das Boot? [1-100] "+ c.liefereTiefgang());
			System.out.println();
			}

	// method for the Hausboot it inherts form Haus and Boat
		public static void infoFuerHaus(Hausboot c) {
			System.out.println("Das Haus hat das Garten? [true/false] "+ c.mitGarden());
			System.out.println("Wie viel Zimmer hat das Haus? [1-10] "+ c.liefereAnzahlZimmer());
			System.out.println();
			}
}
