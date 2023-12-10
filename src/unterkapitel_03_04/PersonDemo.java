package unterkapitel_03_04;


public class PersonDemo {
	public static void main (String [] args) {
		Person peter;
		peter = new Person("Peter");
		Geldautomat automat= new Geldautomat("Spaßkasse");
		int money_got = peter.hebeGeldAb(automat);
		System.out.println(peter.name+" aus dem Automat von "+ automat.name + " wollt Geld heben..\n Er wollte 150 Euros "+
				"von Edins Konto.");
		System.out.println(peter.name+" aus dem Automat von "+ automat.name + " hebt "+money_got+
				" von Edins Konto.");
		System.out.println(peter.name+" kann die Steuer von Edin jetzt bezahlen");
		
	}
}
