package unterkapitel_05_02;
import java.util.*;
import unterkapitel_05_01.Person;

public class HashSetDemo {
	
	
	public static void main(String args[]) {
		
		Set<Person> p = new HashSet<Person>();

	
		p.add(new Person("Donald",30));
		p.add(new Person("Donald",30));
		p.add(new Person("Daisy",28));
		
		for(Person n: p) {
			System.out.println(n.toString());
		}
		
		
	}
	
}
