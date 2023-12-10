package unterkapitel_07_06.ratespiel2;

public class Ratespiel {

	public static final int TIPP_UNGUELTIG = 0;
	public static final int TIPP_RICHTIG = 1;
	public static final int TIPP_ZU_GROSS = 2;
	public static final int TIPP_ZU_KLEIN = 3;
	private int zuRatendeZahl, anzahlVersuche;
	
	public Ratespiel () {
		initialisiereSpiel ();
	}
	
	public void initialisiereSpiel () {
		zuRatendeZahl = (int)(Math.random () * 100) + 1;
		anzahlVersuche = 1;
	}
	
	public int werteTippAus (int tipp) {
		if (tipp<1 || tipp >100) {
			return TIPP_UNGUELTIG;
		}
		else if (tipp > zuRatendeZahl) {
			anzahlVersuche++;
			return TIPP_ZU_GROSS;
		}
		else if (tipp < zuRatendeZahl) {
			anzahlVersuche++;
			return TIPP_ZU_KLEIN;
		}
		else {return TIPP_RICHTIG;}
	}
	
	public int liefereAnzahlVersuche () {
		return anzahlVersuche;
	}
	
	public String liefereSpielregeln () {
		return "Raten Sie eine Zahl zwischen 1 und 100\n"+
				"in möglichst wenig Versuchen!\n"+
				"Bei jedem Tipp erhalten Sie einen Hinweis,\n"+
				"ob die zu ratende Zahl kleiner oder größer\n"+
				"war als Ihr Tipp!\n";
	}
	
	public void liefereSpiel() {
		
	}
}
