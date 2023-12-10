package unterkapitel_03_06;

public class ciao {
	public static void main (String [] args) {
		
		Circle p =new Circle(20);
		System.out.println ("Verhältnis von Fläche und Umfang: ");
		System.out.println(p.AreaPerimeterRatio());
	}
}
