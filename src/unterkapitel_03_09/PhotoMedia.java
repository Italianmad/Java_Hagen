package unterkapitel_03_09;

public class PhotoMedia extends Media {
  private int ax, ay;
  
  public PhotoMedia(String titel, String dateiname, int ax, int ay) {
	  
	  setTitel(titel);
	  setDateiname(dateiname);
	  setAuflösungxy(ax, ay);
  }
  
  public void setAuflösungxy(int bx, int by) {
	  ax = bx;
	  ay = by;
  }
  
  public int getAuflösungx() {
	  return ax;
  }
  
  public int getAuflösungy() {
	  return ay;
  }
  
  public void view() {
	  System.out.println(getDateiname());
  };
}
