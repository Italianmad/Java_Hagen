package unterkapitel_04_01;
import java.lang.Throwable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {
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

		catch(InputMismatchException | ArithmeticException Fehler) {
			System.out.println("Arithmetik- oder Eingabefehler!" + " Java meldet: "+ Fehler.getMessage());	
			
		}
		catch(Exception irgeneinFehler) {System.out.println("Irgendein Fehler.");}
		finally {System.out.println("Bis zum naechsten mal!");}
		}
		
}

