package unterkapitel_03_05;

public class Sportsman extends Person {
	private String sport;
	
	public void setSport(String s) {
		sport = s;
	}
	

	public String getSport() {
		return sport;
	}
	
	
public void introduceYourself() {
		super.introduceYourself();
		System.out.println("Hallo! Mein Name ist: "+getName()+"!");
		System.out.println("Ich übe die Sportart: "+getSport()+" aus!");
	}


}
