package unterkapitel_06_02;

public class Account {
	private int balance;
	public Account(int balance) {
		this.balance = balance;
	}
	
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized boolean withdraw(int amount) {
		synchronized(this){
		if(balance >= amount) {
			
		try {
			Thread.sleep(7); // Race Condition-> other task will be done
		}
		catch(InterruptedException ex) {}
			
			balance -= amount;
			return true;
		
		}
		else return false;
		}
	}
	
	
	public void PayIn(int amount) {
		synchronized(this) {
		balance += amount;
		}
	}
}
