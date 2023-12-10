package unterkapitel_02_05;

public class Potenzieren {
	public static void main (String args[]) {
		int x = 2;
		int start = x;
		int y = 8;
		int exp = y;
		int result = 1;
		while(y > 0) {
			result *= x;
			y--;
		}
		System.out.println(start + " hoch "+exp+ " ergibt "+ result);
	}	

}
