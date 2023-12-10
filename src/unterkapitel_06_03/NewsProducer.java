package unterkapitel_06_03;

public class NewsProducer extends Thread {
	private Clipboard clipboard;
	private String name;
	private String [] news = {
			"Weltfrieden erreicht",
			"Java Sprache des Jahres",
			"Twix heißt jetzt doch wieder Raider",
			"Spinat doch gesund - aber nur bei Vollmond"};


	
	
	public NewsProducer(Clipboard target, String name) {
		clipboard =  target;
		this.name = name;
	}
	
	
	public void run(){
		
		for(;;) {
		
			try {
				Thread.sleep ( 1000+(long)(Math.random()*1000));
			}
		
			catch(InterruptedException e) {return;}
			
		synchronized(clipboard) {
			
			if(clipboard.isOccupied()) {
				
				try {
					clipboard.wait();
				} catch (InterruptedException e) {return;}
			}
		
				String nextNews = name+ ":" +news [(int) (news.length*Math.random())];
				
				clipboard.set(nextNews);
				clipboard.notifyAll();
			}		
		}
	}
}
	
