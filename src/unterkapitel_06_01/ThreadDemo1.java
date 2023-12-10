package unterkapitel_06_01;

public class ThreadDemo1 {
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		PongThread i = new PongThread();
		i.start();
		
//		new Thread(new EigenerThread()).start();
		
		
		
		for(int j=0; j < 100000; j++) {
			System.out.println("Ping");
			
			
				
		}

	}
}


