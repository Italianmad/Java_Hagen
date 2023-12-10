package unterkapitel_02_07;

public class Overloading {
	public static void main (String args[]) {
		int m1 = max(12,50);
		float m2 = max(12f, 14.3f);
		float m3 = max (1f, 10f, 2.5f);
		float m4 = max (1f, 10f, 2.5f);
		
		System.out.println("m1 ist "+ m1);
		System.out.println("m2 ist "+ m2);
		System.out.println("m3 ist "+ m3);
		System.out.println("m4 ist "+ m4);
	}
	
	public static int max(int a, int b) {
		if (a>b) return a;
			else return b;
		
	}
	
	public static float max(float a, float b) {
		if (a>b) return a;
			else return b;
		
	}
	
	public static float max(float a, float b, float c) {
		if (max(a,b) == b && b>c) return b;
			else if (max(a,b) == a && a>c) return a;
				else return c;
		
	}
	
	public static float maxcompare(float a, float b, float c) {
		return max(max(a,b),c);
		
	}
}
