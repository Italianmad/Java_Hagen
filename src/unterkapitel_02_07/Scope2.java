package unterkapitel_02_07;

public class Scope2 {
	public static void main (String args[]) {
		float a = 34.3f;
		float b = 12.2f;
		float c = sum(a,b);
		System.out.println("Sum ist "+c);
		
	}
	
	public static float sum(float a, float b) {
		//String f = new String ( new char [] {'H', 'a', 'l', 'l', 'o'} );
		//String g = new String ("Hallo");
		//String c = "Hallo";
		//System.out.println(f+g+c);
		return a+b;
		
	}
	


	
	
	
}

//public static void printn (String s) { ...
//public static void println (float f) { ...
//public static void println (boolean b) { ...
//public static void println () {...