package unterkapitel_05_04;
import java.util.*;
import unterkapitel_05_01.Person;

public class TreeMapDemo {
 public static void main(String args[]) {
	 Person p1 = new Person("Hannah Mustermann",40);
	 Person p2 = new Person("Karl Mustermann", 37);
	 Person p3 = new Person("Ilse Schmitt", 38);
	 
	 Address a1 = new Address("Musterstrasse", 1, "Musterstadt");
	 Address a2 = new Address("Badstrasse", 14, "Hagen");
	 
	 TreeMap<Person, Address> addressbook = new TreeMap<Person, Address> (); // instance of Person will call compareTo for Person and we order the people according to the age 
	 addressbook.put(p1, a1);
	 addressbook.put(p2, a1);
	 addressbook.put(p3, a2);
	 
	 Collection<Person> persons = addressbook.keySet();
	 
	 
	 for(Person person : persons) {
		 System.out.println("Schlüssel: "+ person);
		 System.out.println("Werte: "+ addressbook.get(person)); // collectionname.get(key) -> it gives the value 
		 System.out.println();
	 }
 }
}



