package unterkapitel_06_02;

public class Person implements Runnable {
	
	private String name;
	private Account myAccount;
	private int mySpendings;
	
	
	public Person(String name, Account myAccount) {
		this.name = name;
		this.myAccount = myAccount;
		
	}
	
	
	public int getMySpendings() {
		return mySpendings;
	}
	
	public void run() {
		boolean success;
		do {
			
			int amount = 1 + (int) (Math.random()*9);
		    success = myAccount.withdraw(amount);
			
			if(success) mySpendings += amount;
		}
		while(success);
	}

}
