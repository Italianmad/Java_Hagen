package unterkapitel_03_09;

public class Tur {
	private boolean offen;
	private boolean abgeschlossen;
	
	public void getOffen(boolean o) {
		offen = o;
	}
	
	public boolean setOffen() {
		
		return offen == true;
		 
	}
	
	public void getAbgeschlossen (boolean a) {
		
		abgeschlossen = a;
	}
	
	//public boolean setAbgeschlossen() {
	//if (verriegeln()== true && !offen) return true;
	//return abgeschlossen == true;
		 
	//}
	
	//public boolean offnen() {
		//if (schliessen()==false && !verriegeln()==false) return true;
		//else return false;
		
	//}
	//public boolean schliessen() {
		//return true;
	//}
	
	//public boolean verriegeln() {
		
	//}
	//lock
	//public boolean entriegeln() {} //sblocca
	
}
