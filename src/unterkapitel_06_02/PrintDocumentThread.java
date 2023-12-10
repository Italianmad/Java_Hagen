package unterkapitel_06_02;

public class PrintDocumentThread extends Thread{
	
	private Printer printer;

	public PrintDocumentThread(String ThreadName, Printer printerResource) {
		setName(ThreadName);
		this.printer = printerResource;
		
	}

	
	public void run() {
		synchronized(printer){  // non uso this perche´ e´ fuori dalla classe printer
		printer.initPrinter(getName());
		
		for (int i=1; i<=3; i++) {
			printer.usePrinter("Dokument Nr."+i);
		}
		
	  }
	}
}
