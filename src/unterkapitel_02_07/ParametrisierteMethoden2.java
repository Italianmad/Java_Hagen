package unterkapitel_02_07;


public class ParametrisierteMethoden2 {
	public static void main (String args[]) {
		int a,c;
		a = 8;
		c = 12;
		System.out.println("Der ggT von " + a + " und "+ c + " ist: " +ggt(a,c));
		System.out.println();
		System.out.print("Der ggT von " + a + " und "+ c + " ist: ");
		mcd(a,c);
	}
	
	public static int ggt(int a, int b) {
	int maxa = 0;
	int maxb = 0;
	if (a >=b) {
	for (int i=1; i<= a/2; i++) {
		if(a % i==0)
		 maxa = i; 
	}
	
	for (int i=1; i<= b/2; i++) {
		if(b % i==0) {
		 maxb = i;
		 } 
		}
	if (maxa == maxb) {
		return maxa;
		
		}
	 return maxb;
	}
	else {
		for (int i=1; i<= a/2; i++) {
			if(a % i==0)
			 maxa = i; 
		}
		
		for (int i=1; i<= b/2; i++) {
			if(b % i==0) {
			 maxb = i;
			 } 
			}
		if (maxa == maxb) {
			return maxb;
			
			}
		 return maxa;
		}
	}
	
	public static void mcd(int a, int b) {
		
		while(b > 0) {
			if(a > b) a -= b; 
			else b -= a;
		}
		System.out.print(a);
	}
}
