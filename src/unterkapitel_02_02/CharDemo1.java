package unterkapitel_02_02;

// Nutzen Sie das Programm charDemo, um herauszufinden, welches Wort mit den Zeichencodes 74,
// 65, 86 und nochmal 65 kodiert wird.
public class CharDemo1 {
	public static void main (String args []) {
		
		char einZeichen = 74; // from 0 to 65535
		char einZeichen2 = 65; 
		char einZeichen3 = 86; 
		char einZeichen4 = 65; 
		
	
		
		System.out.println("Das Zeichen für 74 ist: " + einZeichen);
		System.out.println("Das Zeichen für 65 ist: " + einZeichen2);
		System.out.println("Das Zeichen für 86 ist: " + einZeichen3);
		System.out.println("Das Zeichen für 65 ist: " + einZeichen4);
		
		
	}
}
