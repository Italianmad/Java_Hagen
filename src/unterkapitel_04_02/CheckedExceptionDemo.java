package unterkapitel_04_02;
import java.io.*;


public class CheckedExceptionDemo {
 public static void main (String args[]) {
	 FileReader filereader;
	
	 
	 try {
		 filereader = new FileReader("gibtsnicht.txt");
		
	 }
	 catch(FileNotFoundException fl){
		 System.out.println("Die Datei gibtsnicht.txt wurde nicht gefunden!");
	 }
 }
}
