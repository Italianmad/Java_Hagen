package unterkapitel_02_07;

public class ParametrisierteMethoden4 {
	public static void main (String args[]) {
		int a,b;
		a = 2;
		b = 10;
		System.out.println("ggT("+a+ ","+b+ ")= "+ggt(a,b));
		System.out.println("Die groesste Zahl ist "+getGreater(a,b));
		log("Very welcome to my web-site", false);
		System.out.println("Result ist "+ potenz(a,b));
		System.out.println("Result ist "+ Math.pow(a,b));
	}
	
	public static int ggt(int a, int b) {
		
		while(b > 0) {
			if(a > b) a -= b; 
			else b -= a;
		}
		return a;
	}
	
	public static int getGreater(int a, int b) {
		if (a>b) return a;
		else return b;
	}
	
	public static void log(String message,boolean preventLogging) {
		if(preventLogging) return;
		else System.out.println("LOG: "+message);
	}
	
	public static long potenz(int a, int b) {
		int res = 1;
		for (int i = 0; i<b; i++) {
			res *= a;
		}
		return res;
	}
}
