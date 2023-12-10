package unterkapitel_05_02;
import java.util.*;
import unterkapitel_05_01.Person;

public class TreeSetDemo2 {
	
	public static void main(String args[]){
		Set<Person> persons = new TreeSet<Person> ();
		
		persons.add(new Person("Ale",43));
		persons.add(new Person("Maria",23));
		persons.add(new Person("Ciulby",25)); // if it was ("Ciulby",23) it would not be print
		
		
		// List<Person> list = new ArrayList<>(persons);
		// Collections.sort(list);
		// Collections.reverse(list);
		 
		
//		for(Person person:list) {
//			System.out.println(person);
//		}
		

		for(Person person:persons) {
			System.out.println(person);
		}
		

	}
}
