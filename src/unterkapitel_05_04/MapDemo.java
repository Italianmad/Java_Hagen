package unterkapitel_05_04;
import unterkapitel_05_01.Person;
import java.util.HashMap;


public class MapDemo {
	 public static void main(String args[]) {

		 HashMap<String, Person> l= new HashMap<String, Person>();
		 l.put("Popstar", new Person("Madonna", 23));
		 l.put("Wissenschafler", new Person("Einstein", 63));
		 l.put("Dichter", new Person("Goethe",82));
	
		 
		 Person einDichter = l.get("Dichter");
		 Person einDirigent = l.get("Dirigent");

		 
		 System.out.println("Ein Dicther: " + einDichter);
		 System.out.println("Ein Dicther: " + einDirigent);
		 
		 if (l.containsValue(einDichter)) {
			 System.out.println("ME and Paharo won the lottery");
		 } else System.out.println("ME and Paharo did not win the lottery");
	
		 System.out.println(l.keySet());
		 System.out.println(l.values());// all that was in person
		}
}
