package unterkapitel_05_04;

import java.util.*;
import unterkapitel_05_01.Person;

public class CustomerDB {
	public static void main(String args[]) {
		
		Map<String, Person> cost = new HashMap<> ();
		Person p1 = new Person("Mayer",52);
		Person p2 = new Person("Müller",34);
		Person p3 = new Person("Schmidt",24);
		
		cost.put(p1.getName(), p1);
		cost.put(p2.getName(), p2);
		cost.put(p3.getName(), p3);
		
		Scanner s = new Scanner (System.in); // to write a name in the console
		System.out.println("Kundensuche");
		System.out.println("Bitte Namen des gesuchten Kunden eingeben:");
		String nameToFind = s.next();
		Person pfound = cost.get(nameToFind);
		
		if(pfound==null) {
			System.out.println("Kunden "+nameToFind+ " nicht gefunden");
		}
		else {System.out.println("Kundendaten für "+nameToFind+ ": \n"+pfound);}
	}

}
