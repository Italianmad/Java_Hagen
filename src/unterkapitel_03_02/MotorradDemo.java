package unterkapitel_03_02;

public class MotorradDemo {
	public static void main (String [] args) {
		Motorrad.anzahlMotorraeder=10; 
		// Motorrad.tempo not callable 
		// Motorrad.tempo;
		System.out.println("Die Anzahl der Raeder ist: "+ Motorrad.anzahlMotorraeder);
		Motorrad m1 = new Motorrad(), m2 = new Motorrad();
		int tempo1 = m1.tempo; // dynamic is callable after creating an object
		int tempo2 = m2.tempo;
		Motorrad.anzahlMotorraeder=20;
		System.out.println("Das Tempo der Raeder 1 ist: "+ tempo1);
		System.out.println("Das Tempo der Raeder 2 ist: "+ tempo2);
		System.out.println("Die Anzahl der Raeder ist: "+ m1.anzahlMotorraeder);
		System.out.println("Die Anzahl der Raeder ist: "+ m2.anzahlMotorraeder);
	}
}
