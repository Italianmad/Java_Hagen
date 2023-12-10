package unterkapitel_02_05;

public class PINAbfrage {
	public static void main (String args[]) {
		int eingabePin;
		
		int pin = 1234;
		int tippNum = 0;
		do {
			tippNum++;
			
			System.out.println("PIN ("+ tippNum + ". Versuch):");
			eingabePin = lesenInt(); // inside the do
			
		}
		while(tippNum < 3 && eingabePin != pin);
		if (tippNum < 3)
		{
			System.out.println("Zugang verweigert!");
		}
		else {
			System.out.println("Zugang gewährt!");
		}

		
	}
	
	public static int lesenInt() {
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try {return Integer.parseInt(br.readLine());}
		catch(Exception ex) {return 0;}
	}
}
