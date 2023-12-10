package unterkapitel_06_04;

public class ThreadX {
	public static void main (String [] args) {
		
		System.out.println("Start Countdown");
		
		Xt XThread = new Xt();
		
		XThread.start ();
		
		}
		 }
		
		
		class Xt extends Thread {
		
		
		public void run () {
		
		for (int i = 10; i >= 0 ; i--)
		
		System.out.println (i);
}
		}
