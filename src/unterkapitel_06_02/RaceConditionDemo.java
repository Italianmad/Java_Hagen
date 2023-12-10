package unterkapitel_06_02;

public class RaceConditionDemo {
	
	public static void main(String args[]) throws InterruptedException {
		
	 Account myAccount = new Account(1000);
	 Person peter = new Person("Peter", myAccount);
	 Person maria = new Person("Maria", myAccount);
	 
	 
	 Thread p = new Thread(peter);
	 Thread m = new Thread(maria);
	 
	 p.start();
	 m.start();
	 
	 p.join();
	 m.join();
	 
	 System.out.println("Maria hat "+ maria.getMySpendings() + "€ ausgegeben!");
	 System.out.println("Peter hat "+ peter.getMySpendings() + "€ ausgegeben!");
	 int sum = maria.getMySpendings() + peter.getMySpendings();
	 System.out.println("Zusammen sind das "+ sum + "€ !");
	 System.out.println("Kontostand: "+ (myAccount.getBalance()));
	 
	}
 
}
