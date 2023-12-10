package unterkapitel_05_01;

import java.util.*;

public class CollectionDemo {
	public static void main(String args[]) {
		Collection<String> n = new ArrayList<String> ();
		n.add("Grün");
		n.add("Röt");
		n.add("Blau");
		System.out.println("Elemente der Menge:");
		
		System.out.println(n.iterator()); // it send me the class of the iterator connected to the array
		
		for (String element:n) {
			System.out.println(element);
		}
	}

}
