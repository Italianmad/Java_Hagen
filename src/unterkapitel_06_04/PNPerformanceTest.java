package unterkapitel_06_04;

import java.util.Set;

public class PNPerformanceTest {
 public static void main (String args[]) {
	 for(int i=1; i<=10; i++) {
		 long a = System.currentTimeMillis();
		 Set<Integer> pnc = PNComputer.computePrimeNumbers(1000, 1000000,i);
		 a = System.currentTimeMillis()-a;
		 System.out.println("Berechne Primzahlen zwischen 1000 und 1000000 mit "+ i+ " Threads, \n benötigte Zeit: "
	 + a+ " ms!");
	 }
 }
}
