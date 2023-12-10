package unterkapitel_03_05;

public class Vererbung {
	public static void main (String [] args) {
		
		Person n = new Person();
		//String name = n.getName(); // Defined in the previous page. 
		Sportsman p = new Sportsman();
		//String sportman = p.getSport();
		
		n.setName("Paul");
		p.setName("Maria");
		
		
		n.introduceYourself();
		p.introduceYourself();
		
		Athlete a = new Athlete();
		a.introduceYourself();
		
	}
}
