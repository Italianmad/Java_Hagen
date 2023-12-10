package unterkapitel_02_02;

public class VariablenUeberlauf2 {
	public static void main(String args[]) {                     
	     
		int alterInJahren = 70; // from -2.147.483.648 and +2.147.483.647
		long alterInSekunden = alterInJahren * 365L * 24L * 60L * 60L; // +/- 9.223.372.036.854.775.808
		//String name = "Alessandra";                                            
		                                    
		//System.out.println ("Hallo "  + name + "!");                
		System.out.println("Sie sind "+ alterInJahren + " alt.");
		System.out.println("Dies entspricht "+ alterInSekunden + " Sekunden.");   
	}

}
