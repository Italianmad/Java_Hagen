package unterkapitel_02_04;

public class IfDemo2 {
	public static void main (String args[]) {
		int alter = 20;
		int alterlim =18;
		if(alter > alterlim) {
			
			System.out.print ("Seit "+(alter-alterlim)+" Jahren ");
			System.out.println("sind Sie volljährig!");
			
		}
		else {
			System.out.print ("In "+(18-alter)+" Jahren ");
			System.out.println("Sie sind volljährig!");
			
			
		}
		System.out.println("Auf Widersehen!");
		
	}

}
