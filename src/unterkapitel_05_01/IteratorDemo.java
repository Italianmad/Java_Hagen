package unterkapitel_05_01;
import java.util.*;

public class IteratorDemo {

	public static void main (String args[]) {
		Set<String> s = new TreeSet <String> ();
		s.add("Kirche");
		s.add("Apfel");
		s.add("Birne");
		
		// How to call an iterator in a for cycle
		
		for (Iterator<String> i = s.iterator(); i.hasNext();) {
			String aF = i.next();
			System.out.println(aF);
		}
		
		Iterator<String> si = s.iterator();
		while(si.hasNext()) {
			if (si.next().equals("Apfel")) si.remove();
			
			
		}
		
	}
	
}
