package unterkapitel_02_07;

public class ParametrisierteMethoden1 {
	public static void main (String args[]) {
		int a,b;
		a = 5;
		b = -10;
		printSignum(a);
		printSignum(b);
	}
	
	public static void printSignum(int a) {
		if (a > 0) {
			System.out.println(a+" ist positiv");
		}
		else System.out.println(a+" ist negativ");
		
	}
}
