package unterkapitel_03_03;

public class Motorrad {
	
		public int anzahlMotorraeder;
		public int tempo = 20;
		
	public Motorrad(int t) {
		tempo =t;
		anzahlMotorraeder++;
		
	}
	public static void main (String [] args) {
	
	Motorrad [] moto = new Motorrad[10];
	for(int i=0; i<10; i++) {
		moto [i] = new Motorrad(0);
	}
	System.out.println("Anzahl Instanzen der Klasse Motorrad: "+ moto[0].anzahlMotorraeder);
	System.out.println("Anzahl Instanzen der Klasse Motorrad: "+ moto[5].anzahlMotorraeder);
	
}	
	
}
