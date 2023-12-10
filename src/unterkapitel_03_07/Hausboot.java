package unterkapitel_03_07;

public class Hausboot implements Haus, Boat {
	private boolean mitMotor;
	private int anzahlzimmer;
	private double tiefgangInCm;

	public Hausboot(int zimmer, int tiefgang, boolean mitMotor) {

		
		anzahlzimmer  = zimmer;
		
		tiefgangInCm = tiefgang;
		this.mitMotor = mitMotor;
	}

	public int liefereAnzahlZimmer() {
		return anzahlzimmer;
	}

	public boolean mitGarden() {
		return false;
	}
	
	public double liefereTiefgang() {
		return tiefgangInCm;
	}

	public boolean hatMotor() {
		return mitMotor;
	}
}
