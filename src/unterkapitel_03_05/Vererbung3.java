package unterkapitel_03_05;

public class Vererbung3 {
	public static void main (String [] args) {
		Poodle p;
		p = new Poodle();
		Dog n;
		n = new Dog("Schnauzer");
		
		System.out.println("Ordnung: " + p.getOrder());
		System.out.println("Race: " + p.getBreed());
		
		System.out.println("Order: " + n.getOrder());
		
		System.out.println("race: " + n.getBreed());
		
	}
}

