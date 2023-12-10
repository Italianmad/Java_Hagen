package unterkapitel_06_03;

public class NewsConsumer extends Thread {
	
	private Clipboard clipboard;
	private String name;
	
	public NewsConsumer(Clipboard source, String name) {
		clipboard = source;
		this.name = name;
	}
	
	
	public void run() {
		for(;;) {
				try {
				
					Thread.sleep(1000);
				}
				
				catch(InterruptedException ex) {return;}
				
			synchronized(clipboard) {
				while(!clipboard.isOccupied()) 
				{
					try {
						
						clipboard.wait();
					}
					
					catch(InterruptedException ex) {return;}
					
					System.out.println("Got news: "+clipboard.recall());
					clipboard.notifyAll();
					
				}
			}
	}

	}
}

