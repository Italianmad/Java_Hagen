package unterkapitel_03_01;

public class StringDemo {
	public static void main (String args[]) {
		String inf = "Strings sind Objekte";
		String upper =inf.toUpperCase();
		String cut = inf.substring(13,19);
		String finalString = cut.concat("orientierung");
		boolean verify = finalString.startsWith("Objekt", 0); // I start the research from position 0.
		
		
		System.out.println(upper);
		System.out.println(finalString);
		System.out.println(verify);
	}
	
}
