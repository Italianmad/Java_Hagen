package unterkapitel_02_05;

public class FakultaetMitFor {
	static long n;
	public static void main (String args[]) {
		int i = 7;
		int count = i;
		n = 1;
		for(;i>=1; n *=i, i--);
		System.out.print("Die Fakultaet von "+ count + " ergibt "+ n);
		
		// for(long x=6, y=1; x>=1; y*=x, x--);
		
	}

}
