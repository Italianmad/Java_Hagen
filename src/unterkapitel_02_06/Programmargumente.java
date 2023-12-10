package unterkapitel_02_06;

public class Programmargumente {
	public static void main (String args[]) {
		int [][] bitmap = new int [10] [11] ;
		System.out.println("Folgende Argumente wurden beim Start an dieses Programm übergeben:");
		if(args.length == 0) {
			System.out.println("Keine Argumente!");
			
		}
		else {
			for(int i=0; i < args.length; i++) {
				System.out.print((i+1)+". Argument: '"); 
				System.out.println(args[i]+"'");
			}
			
		}
		
		
		
	}
}
