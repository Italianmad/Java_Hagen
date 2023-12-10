package unterkapitel_03_01;

public class ReferenzDemo {
	public static void main (String args[]) {
		Auto a,b;
		a= new Auto();
		a.firma = "BMW";
		b=a;
		b.firma = "Porsche";
		System.out.println(a.firma);
		if(a.equals(b)) System.out.println("WTF"); // They refer all to the same car, the second one the Porsche!!!
		else  System.out.println("It makes sense");
	}
}
