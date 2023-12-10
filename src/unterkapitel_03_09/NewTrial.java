package unterkapitel_03_09;

public class NewTrial {
	public static void main (String args []) {
	Pair1<String> p1 = new Pair1<String>("Du", "Ich");
	System.out.println("Der Winner ist: "+p1.getTheother());
	
	Pair1<String> p2 = new Pair1<String>("er","es");
	System.out.println("Pieros' Nickname ist: " +p2.getTheother());
	
	}	
}
