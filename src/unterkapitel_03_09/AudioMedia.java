package unterkapitel_03_09;

public abstract class AudioMedia extends Media {
	
	private String interpreter;
	private double laenge;
	
	public AudioMedia(String titel, String dateiname,String i, double l) {
		setTitel(titel);
		setDateiname(dateiname);
		setInterpreter(i);
		setlaenge(l);
		
	} 
	
	
	public void  setInterpreter(String i) {
		this.interpreter = i;
	}
	
	public String getInterpreter() {
		return interpreter;
	}
	
	
	public void  setlaenge(double l) {
		this.laenge = l;
	}
	
	public double getlaenge() {
		return laenge;
	}
	
	public void view() {
		  System.out.println(getDateiname());
	  };
}
