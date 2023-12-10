package unterkapitel_05_02;
import java.util.*;
import unterkapitel_05_01.Person;

public class ComparatorDemo {
	public static void main(String args[]) {
		Comparator<Person> comparator = new SpecialPersonComparator(); 
		Set<Person> persons = new TreeSet<Person>();
		
		persons.add (new Person ("Karl", 20));
		persons.add (new Person ("Willi", 40));
		persons.add (new Person ("Heinz", 30));
				
				
				
		
		
		for (Person s:persons) {
			System.out.println(s);
		
		}

}

// Static class SpiecialPersonCompartor can not be instantiated before CompartorDemo
 static class SpecialPersonComparator implements Comparator<Person> {
	 @Override
		 public int compare(Person p1, Person p2) {
			 return p1.getAge()-p2.getAge();}
	}
}
