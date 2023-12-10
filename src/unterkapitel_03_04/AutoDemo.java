package unterkapitel_03_04;

import unterkapitel_03_04.Auto;


public class AutoDemo {
	public static void main (String [] args) {
		Auto batmobil = new Auto();
		batmobil.setSpeed(320);
	
		System.out.println("Batmobils Geschwindkeit: "+batmobil.getSpeed()+" km/h");
		
		Auto destroyes = new Auto();
		destroyes.setPower(-320);

		System.out.println("Destroyes hat die Leistung von: "+ destroyes.getPower() +" cv");
		
		Auto devastation = new Auto();
		devastation.setMarke("Edin zerstoretes Auto");
		String  newdestauto = devastation.getMarke();
		//String  newdestauto1 = devastation.setMarke();
		
		System.out.println("Typ von Auto(Edin): "+ devastation.edindestroyedcar +"...ops Edin dein Auto ist total kaputt gegangen");
		String autotype = devastation.getMarke();
		System.out.println("Typ von Auto(es ist nicht von Edin): "+ autotype  +"...ops Edin dein Auto ist total kaputt gegangen,\n aber alles andere funktionieren. ;D");
	}
}
