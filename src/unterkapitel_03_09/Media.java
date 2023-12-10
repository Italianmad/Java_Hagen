package unterkapitel_03_09;

public abstract class Media {
	private String titel;
	private String dateiname;
	
	
	
	public void setTitel(String t) {
	   titel =t;
	}

	
	public String getTitel() {
		return titel;
	}
	
	
	public void setDateiname(String d) {
		if(dateiname != "") dateiname =d;
		else dateiname ="new";
	}

	
	public String getDateiname() {
		 return dateiname;
	}
	
	public abstract void view();
	

}
