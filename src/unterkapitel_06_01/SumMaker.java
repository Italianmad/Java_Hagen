package unterkapitel_06_01;

public class SumMaker extends Thread {
		private int from, to;
		private long sum;
		public SumMaker(int from, int to) {
			this.from = from;
			this.to = to;
			sum = 0;
		}
		
		
public long getSum() {
	return sum;
}

public void run() {
	for(int i= from; i <= to; i++) {
		sum += i;
		}
	}
}
