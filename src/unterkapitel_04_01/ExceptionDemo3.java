package unterkapitel_04_01;

import java.util.Scanner;
import java.util.*;
import java.util.InputMismatchException;


public class ExceptionDemo3 {
	public static void main(String args[]) {
	int divident, divisor, res;
	Scanner scanner = new Scanner(System.in);
	
	try {
		
	System.out.println("Divident ");
	divident = scanner.nextInt(); // to get the first number
	System.out.println("Divisor ");
	divisor = scanner.nextInt(); // to get the second number
	res = divident/divisor;
	
	}

	catch(InputMismatchException e1) {
	System.out.println("Ungültige Eingabe beim Dividenten oder beim Divisor!");	
	}
	catch(ArithmeticException arithmetikFehler) {
		System.out.println("Arithmetik Fehler. \n" + "Java meldet: "+ arithmetikFehler.getMessage());	
		
	}
	catch(Exception irgeneinFehler) {System.out.println("Irgendein Fehler.");}
	finally {System.out.println("Bis zum naechsten mal!");}
	}
}
