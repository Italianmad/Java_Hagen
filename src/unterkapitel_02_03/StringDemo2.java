package unterkapitel_02_03;

public class StringDemo2 {
	public static void main (String args[]) {
		
		String a, b, c, d, e;
		
		a="Auto";
		b="bus";
		c="bahn";
		
		d = a.concat(c);
		e = a.concat(b);
		
		System.out.println (d + " ist d.");
		
		System.out.println (e + " ist e.");
		
		if(20+20+"Text"== "40Text") {
			System.out.println("You are a right");
		}
		System.out.println("You are a wrong");
	} // you can sum number and then concatenate them to a string. 
}
