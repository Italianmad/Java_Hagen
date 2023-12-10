package unterkapitel_03_05;

public class Person {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName( ) {
		return name;
	}
	
	public void introduceYourself() {
		
		System.out.println("Mein Name ist: "+getName()+"!");
	}

}
