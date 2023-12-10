package unterkapitel_05_03;
import java.util.*;

public class ListDemo {
 public static void main(String args[]) {
	 ArrayList<String> zahlen = new ArrayList<>();
	 
	 zahlen.add("Eins");
	 zahlen.add("Erdbeere");
	 zahlen.add("Drei");
	 zahlen.add("Apfel");
	 zahlen.add("Birne");
	 zahlen.add("Vier");
	 
	 zahlen.remove("Birne");
	 zahlen.remove(3);
	 
	 
	 zahlen.set(1, "Zwei");
	 
	 zahlen.add(2, "Zweieinhalb");
	 //System.out.println(zahlen.indexOf("Eins"));
	 
	 for(String n: zahlen) {
		 System.out.println((zahlen.indexOf(n)+1)+".ter Eintrag: "+n);
		 
	 }
	 
	 
	 System.out.println("*******************************************");
	 for(int i=0; i<zahlen.size();i++) {
		 System.out.println((i+1)+".ter Eintrag: "+zahlen.get(i));
	 }
 }
}
