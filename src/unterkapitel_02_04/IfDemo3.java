package unterkapitel_02_04;
//import java.util.Scanner;


public class IfDemo3 {
	public static void main (String args[]) {
		int alter;
		//Scanner scanner = new Scanner(System.in);
        System.out.print("Gebe Sie bitte Ihre Alter ein: ");
        //String alter1 = scanner.nextLine();
        //alter = Integer.parseInt(alter1);
        alter = readInt();
        if(alter < 3 || alter > 99) {
        	System.out.println("Ungültige Eingabe!");
        }
        else {
        	System.out.println("Sie sind also "+ alter +" Jahre alt!");
        	if(alter > 12 | alter < 20) {
        		System.out.println("Sie sind ein Teenager!");
        	}
        	else {
        		System.out.println("Sie sind kein Teenager!");
        	}
        }
		
	}
	
	public static int readInt () {
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try {return Integer.parseInt (br.readLine());}
		catch (Exception ex) {return 0;}
		}
}
