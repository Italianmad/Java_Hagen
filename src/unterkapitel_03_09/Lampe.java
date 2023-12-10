package unterkapitel_03_09;

public class Lampe {
	
	public boolean onoff=true;
	
	public Lampe() {schalteEin();}
	
	public Lampe(boolean onoff) {
		if (onoff) schalteEin();
		else schalteAus();
	}
	
	public void schalteEin() {
		onoff=true;
	}
	
	public void schalteAus() {
		onoff= false;
	}
	
	public void zeigeZustand() {
		if (onoff== true) System.out.println("Lampe ist eingeschaltet");
		else System.out.println("Lampe ist ausgeschaltet");
	}

}
