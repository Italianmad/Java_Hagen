package unterkapitel_06_01;

public class TextTicker implements Runnable {
	private String s;
	
	public TextTicker(String s) {
		this.s = s; 
		
	}
	
	public void run() {
		for(int i=0; i < 100000; i++) {
			System.out.println("Pong");
			
		}
	}
}