package unterkapitel_05_01;

public class EqualsDemo {
 public static void main(String args[]) {
	Person p1 = new Person ("Dagobert", 55);
	Person p2 = new Person ("Dagobert", 55);
	Person p3 = new Person("Ciulby",96);
	
	System.out.println("p1==p2? "+ (p1==p2));
	System.out.println("p1.equals(p2)? " + p2.equals(p1));
	System.out.println("p1.equals(p3)? " + p1.equals(p3));
	System.out.println("p1.equals(\"Hallo\")? " + p1.equals("Hallo"));
	System.out.println("p1.equals(\"null\")? " + p1.equals(null));
 
 }
 
}
