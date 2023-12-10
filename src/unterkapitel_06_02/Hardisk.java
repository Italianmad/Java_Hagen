package unterkapitel_06_02;

public class Hardisk {
	
		private String name;
		
		public Hardisk(String name) {
			this.name = name;
		}
		
			
	public synchronized void open() {
		System.out.println("Datei wird geoffnet!");
	} 
	
	
	public synchronized void read() {
		System.out.println("Datei wird ausgelesen!");
	} 
	
	
	public synchronized void write() {
		System.out.println("Datei wird geschrieben");
	}

	public String toString(){
		return name;
	} 
}



