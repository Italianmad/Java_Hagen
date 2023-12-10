package unterkapitel_03_06;

public class Test {
	public static void main (String [] args) {
		showInfoFor(new Circle(1.0));
		showInfoFor(new Circle(2.0));
		showInfoFor(new Rectangle(2.0,3.0));
	}

	public static void showInfoFor(Figure x) {
			
		System.out.println("INFOS FüR " + x);
		System.out.println("Fläche: " + x.getArea());
		System.out.println("Umfang: " + x.getPerimeter());
		System.out.println("Verhältnis von Fläche und Umfang: " + x.AreaPerimeterRatio());
		System.out.println();
		
	}
 }

