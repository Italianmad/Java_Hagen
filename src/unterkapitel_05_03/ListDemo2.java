package unterkapitel_05_03;

import java.util.*;

public class ListDemo2 {
	public static void main(String args[]) {
		List<String> time = new LinkedList<>();
	
		
		
		for(int i = 0; i < 1000000; i++) {
			time.add(new String("Element Nr." +(i+1)));
		}
		
		long timeForOpin = System.currentTimeMillis();
		
		for(int j = 0; j < 10; j++) {
			time.get(500000);
		}
		
		long timeForOp = System.currentTimeMillis();
		System.out.println("Benötigte Zeit: " +(timeForOp-timeForOpin)+ "!");
	}
}
