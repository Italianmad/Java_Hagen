package unterkapitel_02_05;

public class WhileDemo1 {
	public static void main (String args[]) {
		int counter = 0;
		for (int i=0; i<10;i++) {
			System.out.println("Widerholung for me: " + counter);
			counter++;
			
		}
		System.out.println ("Fertig mit der erste Scheife!");
		counter = 0; // I must give the value ten otherwise counter=10 and the next cycle would not be compiled
		while(counter < 10) {
			System.out.println("Widerholung " + counter);
			counter++;
		}
		System.out.println ("Fertig!");
	}
	
	

}
