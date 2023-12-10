package unterkapitel_02_05;

public class Fakultaet {
	public static void main (String args[]) {
		long y = 1;
		int x = 7;
		int z = x;
		//System.out.print("Die Fakultaet von "+ x);
		while(x >= 2) {
			y *= x;
			x--;
			
		
		}
		System.out.print("Die Fakultaet von "+ z+ " ergibt "+ y);
		
	}

}
