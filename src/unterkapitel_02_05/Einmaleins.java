package unterkapitel_02_05;

public class Einmaleins {
	public static void main (String args[]) {
	int i=1;
	
	while(i<= 10) {
		
		System.out.println("Das kleine 1*1 mit "+i);
		
		int j=1;
		while(j<=10) {
			
			System.out.println(i+" mal " +j +" ergibt " + (i*j));
			
			j++;
			}
		System.out.println ();
		i++;
		}
	}

}
