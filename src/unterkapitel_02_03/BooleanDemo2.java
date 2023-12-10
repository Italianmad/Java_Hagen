package unterkapitel_02_03;


public class BooleanDemo2 {
	
	public static void main(String args[]) {
		boolean ichHabeUrlaub, esIstWochenende;
		boolean esRegnet, dasWetterIstSchoen;
	    boolean ichHabeFrei, ichMacheEinPicknick;
	    
	    ichHabeUrlaub = true;
	    esIstWochenende = true;
	    esRegnet = true;

	    
	    dasWetterIstSchoen = !esRegnet; //false
	    ichHabeFrei = ichHabeUrlaub | esIstWochenende; // true
	    ichMacheEinPicknick =  dasWetterIstSchoen & ichHabeFrei; // false  der komplette Ausdruck- almeno tutti e due.
	    // ausgewertet wird brechen && und || die Auswertung ab, sobald das Ergebnis des Gesamtausdrucks (si incrociano il signolo segno valuta tutto, quello doppio la prima parte)
	    // feststeht. Guardo in genere il primo
	    
	    System.out.println("Zeit fuer ein Picknick? "+ ichMacheEinPicknick);
	    
	    if (ichHabeFrei &&  dasWetterIstSchoen == ichMacheEinPicknick) {
	    	
		    System.out.println("Eureka!!!");
	    }
	    else {
	    	
	    	System.out.println("I am a loser!");
	    	
	    }
	     
	    boolean likethemother = true;
	    boolean likethefather = true;
	    boolean likegrandmother = true;
	    boolean mygene = likethemother ^ likethefather ^ likegrandmother; // twice gives false, three times give true, four time false. 
	    
	    System.out.println("Do I look like any of them?"+ mygene);
	    int z1 = 10;
	    int z2 = 8;
	    boolean aussage = z1>z2;
	    if(aussage) {
	    	System.out.println("You are a scam!!!");
	    }
	    else {
	    	System.out.println("You are a bad guy");
	    }
		
	}

}



