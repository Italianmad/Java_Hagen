package unterkapitel_03_07;

public class Finanzen implements Constants {
	
	public double berechneMWStAnteil (double betrag)
	{
		return betrag*Mehrwertsteuer  / (100+Mehrwertsteuer);
	}
	

}
