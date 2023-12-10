package unterkapitel_06_04;

import java.util.*;

public class PNComputer extends Thread {
	
	private int from, to;
	private Set<Integer> primeNumbers;
	private boolean isDone;
	
	
	public PNComputer(int from, int to) {
		this.from = from;
		this.to = to;
		primeNumbers =  new TreeSet<Integer> ();
		isDone = false;
	}
	
	
	public synchronized void run() {
		for(int i=from; i<=to; i++) {
			if(isPrimeNumber(i)) {
				primeNumbers.add(i);
			}
			isDone = true;
			notifyAll();
		}
	}
	
	private boolean isPrimeNumber(int number) {
		if (number<3) {
			return false;
		}
		for(double i = 2; i <= Math.sqrt(number); i++) {
			if(number % i ==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public synchronized Set<Integer> getPrimeNumbers() {
		while(!isDone) {
			try {wait();}
			catch(InterruptedException e) {}
			
		}
		return primeNumbers;
	}

	public static Set<Integer> computePrimeNumbers(int from, int to, int numberOfThreads){
		List<PNComputer> threads = new ArrayList<>();
		Set<Integer> allPrimeNumbers = new TreeSet<>();
		Integer intevalSize = to-from+1;
		Integer subIntervalSize = intevalSize / numberOfThreads;
		int remainingIntervalSize =  intevalSize % numberOfThreads;
		
		for(int i= 0; i< numberOfThreads; i++) {
			int subFrom = i * subIntervalSize + from;
			int subTo = subFrom + subIntervalSize - 1;
		
			if(i == numberOfThreads -1) 
			subTo += remainingIntervalSize;
			
			threads.add(new PNComputer(subFrom, subTo));
			}
		    
			for(Thread t :threads) 
				t.start();
			
			for(Thread t:threads)
				try {
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			for(PNComputer t: threads ) 
				allPrimeNumbers.addAll(t.getPrimeNumbers());
			
		
		return allPrimeNumbers;
	}
}
