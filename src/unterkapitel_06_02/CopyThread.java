package unterkapitel_06_02;

public class CopyThread extends Thread {
	
	private String name;
	Hardisk q,z;
	public CopyThread(String name, Hardisk q, Hardisk z) {
		setName(name);
		this.q = q;
		this.z = z;
		
	}
	
	public static final Object hddLock = new Object(); // Sperrobjekt
	
	public void run() {
		for(int i=0; i<1000; i++) {
			synchronized(hddLock) {
			System.out.println(getName()+ " benotigt Lock "+ q);
			
			synchronized(q) {
				q.open();
			
				System.out.println(getName()+ " hat Lock für "+q+" und benötigt nun Lock für "+ z);
				
			synchronized(z){
				System.out.println(getName()+ " hat beide Locks");
				z.open();
				z.read();
				z.write();
			}
			}
			}
		}
	}

}
