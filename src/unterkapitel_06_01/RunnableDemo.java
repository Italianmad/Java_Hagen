package unterkapitel_06_01;

public class RunnableDemo {
	public static void main(String args[]) {
		Runnable i = new TextTicker("Ping"); // usando il costruttore metto la stringa e lo salvo in una variabile di tipo Runnable
		Runnable j = new TextTicker("Pong");
		
		
		Thread pi = new Thread(i); // I create a new Instanz of Thread. 
		Thread po = new Thread(j); 
		
		pi.start();
		po.start();
	}

}
