package unterkapitel_02_05;

public class Einmaleins2 {
	public static void main (String args[]) {
	for(int i=1; i<11;i++) {
		System.out.println("Das kleine 1*1 mit "+i);
		for(int j=1; j<11;j++) {
			System.out.println(i+" mal " +j +" ergibt " + (i*j));
			}
		System.out.println ();
		}
	}
}
