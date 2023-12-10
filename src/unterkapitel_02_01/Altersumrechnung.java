package unterkapitel_02_01;

public class Altersumrechnung {
    
	public static void main(String args[]) {                     
		     
		int alterInJahren = 43; // from -2.147.483.648 and +2.147.483.647
		int alterInSekunden = alterInJahren * 365 * 24 * 60 * 60;
		//String name = "Alessandra";                                            
		                                    
		//System.out.println ("Hallo "  + name + "!");                
		System.out.println("Sie sind "+ alterInJahren + " alt.");
		System.out.println("Dies entspricht "+ alterInSekunden + " Sekunden.");   
	}
}
