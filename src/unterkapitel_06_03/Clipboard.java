package unterkapitel_06_03;

public class Clipboard {
	private String value;
	
	public synchronized void set (String v) {
		value = v;
	}
	
	public synchronized String recall() {
		String v = value;
		value = null;
		return v;
		
	}

	public synchronized boolean isOccupied() {
		return value != null;
		
	}
}
