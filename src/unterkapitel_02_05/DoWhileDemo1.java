package unterkapitel_02_05;

public class DoWhileDemo1 {
	public static void main (String args[]) {
		int alter;
		
		do {
			 System.out.print("Gebe Sie bitte Ihre Alter ein: "); // this  line will always be compiled
			 alter = readInt(); // this  line will always be compiled
		}
		while(alter<6 || alter>99); // if this condition is respected it calculates the next line otherwise the cycle repeats itself;
		System.out.print("Ihr Alter in Tagen: "+(365*alter));
		
	}
	
	public static int readInt() {
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try{return Integer.parseInt(br.readLine());}
		catch(Exception ex) {return 0;}}
		
		
}


