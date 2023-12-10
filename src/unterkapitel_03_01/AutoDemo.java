package unterkapitel_03_01;



public class AutoDemo {
	public static void main (String [] args) {
	int zahl1 = 50;
	int zahl2 = 50;
	String obj1 = new String("Hello");
	String obj2 = new String("Hello");
	if(zahl1 == zahl2) System.out.println("Sie sind gleich");
	else System.out.println("Sie sind anders");
	if(obj1 == obj2) System.out.println("Sie sind gleich");
	else System.out.println("Sie sind anders");//-> This one would be compiled
	if(obj1.equals(obj2)) System.out.println("Sie sind gleich"); // That would be compiled
	else System.out.println("Sie sind anders");
	Auto meins, deins,edin;
	meins = new Auto();
	deins = new Auto();
	edin = new Auto();
	
	meins.firma = "BMW";
	deins.firma = "Toyota";
	meins.geschwindigkeit = 10;
	deins.geschwindigkeit = 0;
	meins.leistung = 120;
	deins.leistung =140;
	meins.farbe = "rod";
	deins.farbe = "blau";
	edin.firma = "Banane";
	edin.geschwindigkeit = -58;
	edin.leistung = -528987889;
	edin.farbe= "Von Voegel bombardiert";
	System.out.println("Meine Marke: "+ meins.firma+ ", Meine Liestung: " + meins.leistung + ", Meine Farbe: " + meins.farbe +", Meine Geschwindigkeit: " + meins.geschwindigkeit);
	System.out.println("Deine Marke: "+ deins.firma+", Deine Liestung: " + deins.leistung + ", Deine Farbe: " + deins.farbe +", Deine Geschwindigkeit: " + deins.geschwindigkeit);
	System.out.println("Deine Marke Edin ist: "+ edin.firma+", Deine Liestung: " + edin.leistung + ", Deine Farbe: " + edin.farbe +", Deine Geschwindigkeit ist super: " + edin.geschwindigkeit);
	//a = new Auto();
	//System.out.println("Marke des neuen Autos: +"a.fima);
	
	}
}
