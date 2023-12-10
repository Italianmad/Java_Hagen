package unterkapitel_03_09;

public class VideoMedia extends Media {
	
	private int laenge;
	
	public VideoMedia(String titel, String dateiname,int l) {
		setTitel(titel);
		setDateiname(dateiname);
		setLaenge(l);
		
	}
	
	public void setLaenge(int l) {
		laenge = l;
	}
	
	public int setLaenge() {
		return laenge;
	}
	
	public void view() {
		  System.out.println(getDateiname());
	  };

}
