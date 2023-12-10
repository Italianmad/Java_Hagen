package unterkapitel_03_09;

public class Demo7 {
	public static void main(String args[]) {
		Bank b = new Bank();
		AccountInterface taxes = new  DBKonto("The German Government",968000, 20000);
		AccountInterface EdinKonto = new  DBKonto("Edin the bad guy", 20000,20000);
		b.transfer(EdinKonto, taxes, 20000f);
	}
}
