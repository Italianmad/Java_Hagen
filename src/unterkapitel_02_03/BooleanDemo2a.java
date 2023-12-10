package unterkapitel_02_03;

public class BooleanDemo2a {

		
		public static void main(String args[]) {
			boolean ichHabeUrlaub, esIstWochenende;
			boolean esRegnet, dasWetterIstSchoen;
		    boolean ichHabeFrei, ichMacheEinPicknick;
		    
		    ichHabeUrlaub = false;
		    esIstWochenende = false;
		    esRegnet = false;

		    
		    dasWetterIstSchoen = !esRegnet; //false
		    ichHabeFrei = ichHabeUrlaub | esIstWochenende; // false
		    ichMacheEinPicknick = ichHabeFrei & dasWetterIstSchoen; // false
		    
		    System.out.println("Zeit fuer ein Picknick2? "+ichMacheEinPicknick);
		    
			

	}


}
