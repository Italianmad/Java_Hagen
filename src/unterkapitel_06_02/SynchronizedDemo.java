package unterkapitel_06_02;

public class SynchronizedDemo {

	public static void main(String args[]) {
		
		Printer p = new Printer();
		
		Thread a = new PrintDocumentThread("Thread A ", p);
		Thread b = new PrintDocumentThread("Thread B ", p);
		
		a.start();
		
		b.start();
	}
}
