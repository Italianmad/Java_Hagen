package unterkapitel_02_05;


public class ZahlenRaten {
	public static void main (String args []) {
		int tipp, zuRatendeZahl, anzahlVersuche;
		int nummer;
		do {
			System.out.println ("Zahlenratespiel");
			System.out.println ("---------------");
			anzahlVersuche = 0;
			zuRatendeZahl = (int)(Math.random () * 100) + 1;
			
			do{
				System.out.print ("Ihr Tipp: ");
				tipp = readInt ();
				if(tipp < 1 || tipp > 100) {
					System.out.println("Tipp nicht gewertet!");
					System.out.println("Geben Sie eine Zahl zwischen 1 und 100 ein!");
					continue;
				 }
				anzahlVersuche++;
			    if(zuRatendeZahl > tipp) {
			    	System.out.println ("Meine Zahl ist größer!");
			    }
			    else if (zuRatendeZahl < tipp) {
			    	System.out.println ("Meine Zahl ist kleiner!");
			    }
			   
				
			}
			
			while(tipp !=zuRatendeZahl);
			System.out.println ("Richtig! Die zu ratende Zahl war "+zuRatendeZahl);
					
			System.out.println ("Sie benötigten "+anzahlVersuche+" Versuche!");
			System.out.println("Geben Sie 1 ein, wenn Sie noch mal spielen möchten ");
			nummer = readInt();}
		    while(nummer==1);
		System.out.println("Auf Wiedersehen!");
		
		
	}

	
	public static int readInt() {
		java.io.BufferedReader br;
		br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		
		try {return Integer.parseInt (br.readLine());}
		catch (Exception ex) {return 0;}
		
		}
		
}
		

