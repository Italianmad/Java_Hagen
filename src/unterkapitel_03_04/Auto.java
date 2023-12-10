package unterkapitel_03_04;

public class Auto {
		private String marke;
		public String edindestroyedcar;
		private int tempo;
		private int ps;
		public Auto () {
		marke = "BMW";
		edindestroyedcar = "Too fucked to be repaired";
		tempo = 0;
		ps = 0;
		}
		public void setSpeed (int s) {
		if (s >= 0 && s <= 180) {
		tempo = s;
			}
		else System.out.print("Auto.setSpeed: Fehler! Geschwindigkeit muss zuwischen 0 und 180\n"
				+ "liegen. Alte Geschwindigkeit wird beibehalten.");
		}
		
		public int getSpeed() {
			return tempo;
		}
		
		public void setPower (int p) {
			if (p >= 40 && p <= 3000) ps = p;
		else System.out.println("Auto.setPower: Angegebene Leistung -320 ist ungültig. Sie muss\n"
				+ "zwischen 30 und 300 liegen. Alter Leistungswert 30 wird beibehalten.");
		}
			

		public int getPower() {
			return ps;
		}

		public void setMarke (String p) {
			
			if (p.equals("BMW") || p.equals("Lamborghini")  || p.equals("Toyota")  || p.equals("vW")) 
				marke=p;
			else if(p.equals("BWM von Edin")) edindestroyedcar=p;
			else System.out.println("Auto.setBrand: Ungültige Marke\nErlaubte Marken: BMW, Mercedes, Toyota und VW.");}
		
		public String getMarke () {
			return marke;
		}
}
			

		

