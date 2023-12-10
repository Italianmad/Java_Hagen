package unterkapitel_04_01;
import java.util.*;
import java.util.InputMismatchException;

public class ExceptionDemo2 {
	public static void main(String args[]) {
		Scanner info = new Scanner(System.in); 
		
		System.out.println("Bitte geben Sie Ihr Alter ein: ");
		 
		 try { 
			 	int userAge = info.nextInt();
			 	System.out.print("Sie sind etwa " + 365*userAge + " Tage alt!");
		 }
		 catch(java.util.InputMismatchException e1) {
			 System.out.println("Fehler! Sie hätten eine Zahl eingeben müssen!");
		 }
		 
		 finally {
			 System.out.print("Kode ist beendet");
		 }
	}
}
