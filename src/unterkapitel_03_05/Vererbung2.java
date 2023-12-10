package unterkapitel_03_05;

public class Vererbung2 {
	public static void main (String [] args) {
		Person p, p1,p2, y;
		p = new Person();
		p.setName("Peter");
		
		p1 = new Sportsman();
		p1.setName("Paul");
		((Sportsman) p1).setSport("Fußball");
		
		y = new Sportsman();
		y.setName("Richard");
		((Sportsman)y).setSport("Judo");
	
		
		p2 = new Programmer();
		p2.setName("Maria");
		((Programmer) p2).setLanguage("Java"); // to make it work I add the classname into brackets. 
		
		introduceOf(p); 
		introduceOf(p1);
		introduceOf(p2);
		introduceOf(y);
	
	}
public static void introduceOf(Person x) {		
		System.out.println(x.getName()+" stellt sich vor");
		System.out.println("Hallo! Mein Name ist "+x.getName());
		x.introduceYourself();
		
	}
}
