package unterkapitel_03_07;

public class Waage {

	public static void main (String [] args) {
		System.out.println("Mehrwertsteuer beträgt: "+ Constants.Mehrwertsteuer+ " Prozent");
		Constants cost = new Finanzen();
		System.out.println("Mehrwertsteuer kostet: "+cost.berechneMWStAnteil (100));
		
		Waage g = new Waage();
		Weighable car = new Car(1500);
		Weighable person = new Person(85);
		Weighable gold = new Goldbar(100);
		Weighable f1 = new RacingCar(800,250);
		Weighable cactus = new Cactus("Barrel cactus", 20);
		
		g.ShowWeigth(car);
		g.ShowWeigth(person);
		g.ShowWeigth(gold);
		g.ShowWeigth(f1);
		g.ShowWeigth(cactus);
		
		//Waage bil = new Waage();
		//bil.ShowWeigth(new Car(1300));
		//bil.ShowWeigth(new Person(63));
		
	}
	
	public static void ShowWeigth(Weighable p) { // Weighable works for Car, Person, Goldbar, RacingCar, Cactus. 
		System.out.println("Das Gewicht beträgt "+ p.getWeigth()+ " kg.");
	}
	
	//public static void ShowWeigth(Person c) {
		//System.out.println("Das Gewicht beträgt "+c.getWeigth()+ " kg.");
	//}
}
