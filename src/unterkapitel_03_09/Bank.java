package unterkapitel_03_09;

public class Bank {
	public void transfer (AccountInterface from, AccountInterface to, float amount) {
			
			System.out.print("Überweise einen Betrag von ");
			System.out.print(amount+"? von "+from.getAccountHolder());
			System.out.println (" zu "+to.getAccountHolder()+"...");
			
			if (from.getBalance () >= amount) {
				from.withdraw(amount);
				to.payIn(amount);
			}
			
			else {
				System.out.print ("Fehler! Deckung von "+from.getAccountHolder());
				System.out.println ("'s Konto reicht nicht aus!");
			}
			
			printAccount (from);
			printAccount (to);
			}
			
			public void printAccount (AccountInterface a) {
				System.out.print (a.getAccountHolder()+"'s ");
				System.out.println (" Kontostand: "+a.getBalance()+"?");
			
			}
}

