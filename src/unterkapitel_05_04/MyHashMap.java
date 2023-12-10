package unterkapitel_05_04;
import java.util.*;

public class MyHashMap {
	
	public static void main(String args[]) {
		HashMap hm = new HashMap() ;
		hm.put ("Oktober", 13.43);
		hm.put("November", 9.77);
		hm.put("Dezember", 2.44);
		System.out.println("November: " + hm.get("November"));
	}
}
