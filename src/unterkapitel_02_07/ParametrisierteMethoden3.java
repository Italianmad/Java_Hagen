package unterkapitel_02_07;

public class ParametrisierteMethoden3 {
	public static void main (String args[]) {
		
		printRepeated("Methode mit Parametern - gar nicht schwer!",4);
	}
	
	public static void printRepeated(String text, int anzahl) {
		while (anzahl>0){
			System.out.println(text);
			anzahl--;
			
		}
		}
		
}

