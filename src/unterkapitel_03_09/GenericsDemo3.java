package unterkapitel_03_09;

public class GenericsDemo3 {
	public static void main (String args []) {
		
		Pair2<Person,String> activity;
		activity = new Pair2<>(new Person ("Frau Antje", 25), "Käse");
		
		System.out.println(activity.getOne().getName()+ " verkauft "+ activity.getTheother());
		System.out.println("Der Werbeikone ist: "+activity.getOne().getName()+
				" und sie ist: "+activity.getOne().getAge()+ " Jahren alt.");
		
		Person p1 = activity.getOne();
		String v1 = activity.getTheother();
		System.out.println("Sehr witchige Personaldate für unsere Unternehme: "+ p1.getName() +", "+ p1.getAge());
		System.out.println("Was verkauft sie? "+ v1);
		
		String grossesHallo = "Hallo".toUpperCase ();
		
		System.out.println(grossesHallo);
		String o = "Objektorientierung".substring(6,18).toUpperCase ();
		System.out.println(o);
	}
}
