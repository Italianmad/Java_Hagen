package unterkapitel_04_03;
import java.io.*;

public class ThrowsDemo {
	
	private FileReader filereader;
	public ThrowsDemo() throws FileNotFoundException {
		try {
		oeffeneDatei();
		}
		catch (FileNotFoundException e) {
			System.out.println ("Fehler beim Instanziieren eines ThrowsDemo-Objektes: Eine wichtige Datei konnte nicht gefunden werden!");
		}
	}
		
	public void oeffeneDatei() throws FileNotFoundException {
		filereader = new FileReader("gibtsnicht.txt");
	}
	
	public static void main (String args[]) throws FileNotFoundException {
		new ThrowsDemo();
	}
}


