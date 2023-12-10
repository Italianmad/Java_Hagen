package unterkapitel_02_05;

public class ContinueDemo {
	public static void main (String args[]) {
		int teil = 13; 
		for(int i=1; i<100; i++) {
			if(i % teil !=0) {
				continue;
			}
			else {
				System.out.println(i+" ist durch "+ teil +" teilbar.");
			}
			
			
		}
		
	}

}
