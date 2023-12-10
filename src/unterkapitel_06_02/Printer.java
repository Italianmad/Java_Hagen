package unterkapitel_06_02;

public class Printer {
	
	private String threadName; 
	
	public synchronized void initPrinter(String threadTName) {
		threadName = threadTName;
		System.out.println(threadName + "initialisiert den Drunker!");
	}
	
	public synchronized void usePrinter(String documentName) { 
		System.out.println(threadName+ " drückt den "+ documentName);
		
	}
	

}




