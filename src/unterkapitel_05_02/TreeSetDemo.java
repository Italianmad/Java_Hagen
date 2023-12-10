package unterkapitel_05_02;
import java.util.*;

public class TreeSetDemo {
	public static void main(String args[]){
	TreeSet<String> fruits = new TreeSet<String> ();
	fruits.add("Apfel");
	fruits.add("Birne");
	fruits.add("Kirsche");
	
	for(String fruit: fruits) {
		System.out.println(fruit);
	}
	
}

}
