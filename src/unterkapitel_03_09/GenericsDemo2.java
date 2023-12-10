package unterkapitel_03_09;

public class GenericsDemo2 {
	public static void main (String args []) {
		Person p1 = new Person ("Frau Müller", 30);
		Person p2 = new Person ("Herr Müller", 30);
		Pair paar = new Pair (p1, p2);
		friendshipToBe(paar);
		
		Pair1<Person> friends;
		Person p3 = new Person ("Hinz", 40);
		Person p4 = new Person ("Kunz", 42);
		friends = new Pair1<Person>(p3,p4);
		
		Pair1 p = new Pair1 ( "Sie", "Er");
		Pair1<String> n;
		n = new Pair1<String> ("Maria", "Prola"); 
		System.out.println("Meine Uhroma heisste: "+ n.getOne());
		System.out.println("Mein Uhroma Familiename heisste: "+ n.getTheother());
		
		System.out.println(friends.getOne().getName()+ " und "+ friends.getTheother().getName()+ " sind Freunde!");
		System.out.println(friends.getOne().getName()+ " und "+ friends.getTheother().getName()+ " sind "+friends.getOne().getAge()+
				" und "+ friends.getTheother().getAge()+ " Jahren alt");
	}
	
	public static void friendshipToBe(Pair p){
		Person p1 = (Person) p.getOne();
		Person p2 = (Person) p.getTheother();
		System.out.println(p1.getName()+ " und "+ p2.getName() + " sind Freunde!");
	}
}
