package unterkapitel_02_05;

public class testZahl {
	public static void main (String args[]) {
		long testZahl = 20L;
		
		System.out.print (testZahl +" ist ");
		for (long i=2; i< 20L; i++) {
			if(testZahl % i == 0) {
				System.out.print ("keine ");
				break; // without break keine will repeat for 20/2 20/4 20/5 20/5 so 4 times
			}
		
		}
		System.out.print ("Primazahl");
	}
}
