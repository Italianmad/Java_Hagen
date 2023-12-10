package unterkapitel_06_01;

public class JoinDemo {
	
	public static void main(String args[]) 
			throws InterruptedException{
		SumMaker s = new SumMaker(1, (int) 1E09);
		SumMaker s1 = new SumMaker((int)1E09+1, (int) 2E09);
		s.start();
		s1.start();
		s.join();
		s1.join();// Synchronization
		long sum = s.getSum()+s1.getSum();
		System.out.println("Summe der Zahler von 1 bis 2 Mrd.: "+ sum);
	}

}



	

