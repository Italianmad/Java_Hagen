package unterkapitel_04_01;

import java.util.*;

public class ExceptionDemo1 {
	public static void main (String [] args) {
	 Scanner info = new Scanner(System.in); 
	 System.out.print("Bitte geben Sie Ihr Alter ein: ");
	 int userAge = info.nextInt();
	 
	 System.out.print("Sie sind etwa " + 365*userAge + " Tage alt!");
	 
	}
}
