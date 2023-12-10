package unterkapitel_02_05;

public class Square {
	public static void main (String args[]) {
		int counter = 10;
		while(counter < 26) {
			System.out.println("Das Quadrat von " + counter + " ist " + (counter * counter));
			counter++;
		}
		System.out.println ("Fertig!");
	}

}
