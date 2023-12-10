package unterkapitel_02_07;

public class EinfacheMethoden {
	public static void main (String args[]) {
		 willKommen();
		 System.out.println("Schön, dass Sie da sind!");
		 aufWiederSehen();
		
		
	}
	
	public static void willKommen() {
		System.out.println("Hallo und herzlich willkommen!");
	}
	public static void aufWiederSehen() {
		for(int i=0; i<2;i++) {
			System.out.print("Bye ");
	}
}
}
