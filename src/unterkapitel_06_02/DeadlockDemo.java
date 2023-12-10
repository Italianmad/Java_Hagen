package unterkapitel_06_02;

public class DeadlockDemo {
	
	public static void main(String arg[]) {
		
		Hardisk hdd1 = new Hardisk("HDD1");
		Hardisk hdd2 = new Hardisk("HDD2");
		
		Thread cs = new CopyThread("Thread A", hdd2, hdd1);
		Thread ct = new CopyThread("Thread B", hdd1, hdd2);
		
		cs.start();
		ct.start();
	}
}
