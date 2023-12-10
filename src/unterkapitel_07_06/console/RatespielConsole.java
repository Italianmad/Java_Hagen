package unterkapitel_07_06.console;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import unterkapitel_07_06.ratespiel2.Ratespiel;

public class RatespielConsole {
	
	private Ratespiel spiel;
	
	public RatespielConsole(Ratespiel spiel) {
		this.spiel = spiel;
		initialisiereSpiel();
		spielen();
	}
		
		
	public void initialisiereSpiel() {
			System.out.println("Ratenspiel");
			System.out.println(spiel.liefereSpielregeln());
			spiel.initialisiereSpiel();

		}
		
		public void spielen () {
			int tipp, auswertung;
			
			do {
					System.out.println("Ihr "+spiel.liefereAnzahlVersuche()+". Tipp:");
					tipp = leseInteger();
					auswertung = spiel.werteTippAus(tipp);
					
					if(auswertung == Ratespiel.TIPP_UNGUELTIG) {
						System.out.println("Eingabe ungültig!");
					}
					
					else if (auswertung == Ratespiel.TIPP_ZU_GROSS) {
						System.out.println("Tipp zu größ!");
						}
						
					else if (auswertung == Ratespiel.TIPP_ZU_KLEIN) {
							System.out.println("Tipp zu klein!");
							
				}
			}while(auswertung != Ratespiel.TIPP_RICHTIG);
			
			
	
			System.out.println("Richtig! Die zu ratende Zahl war "+tipp+
			"! Sie haben "+
			" Sie benötigen: "+spiel.liefereAnzahlVersuche()+
			" Versuche!");
			}
			
	
		


    public static int leseInteger() {
			java.io.BufferedReader br;
			br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

			try {
				return Integer.parseInt(br.readLine());
			} catch (Exception ex) {
				return 0;
			}

		}

}


