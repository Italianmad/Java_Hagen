package unterkapitel_02_03;

public class BooleanDemo3 {
	public static void main (String args []) {
		int z1 = 20;
		int z2 = 20;
		boolean sindGleich = z1 == z2;
		boolean istGroesser = ++z1 > z2;
		boolean istKleinerOderGleich = --z1 <= z2;
		
		System.out.println("z1 == z2 ? "+ sindGleich);
		System.out.println("z1 > z2 ? "+ istGroesser); // true
		System.out.println("z1 <= z2 ? "+ istKleinerOderGleich); //true
		
		int a = 50;
		float b = 50.0f;
		if (a==b) {
			System.out.println("My haters are dummies!");
		}
		
	    System.out.println("My haters are vip!");
		}
}




//z1 == z2 ? true
//z1 > z2 ? false
//z1 <= z2 ? true