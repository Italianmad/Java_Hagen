package unterkapitel_06_04;
import java.util.Set;

public class PNTest {
 public static void main(String args[]) {
	 Set<Integer> pnc = PNComputer.computePrimeNumbers(1, 1000,5);
	 
	 System.out.println(pnc.size()+ " Primzahlen zwischen 1 und 1000 mit 5 Threads gefunden: \n"+pnc);
	 
	 
 }
}
