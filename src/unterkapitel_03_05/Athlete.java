package unterkapitel_03_05;

public class Athlete extends Sportsman{
	private String sport1;
	
	public void setSport1(String s) {
		sport1 = s;
	}
	

	public String getSport1() {
		return sport1;
	}
	
public void introduceYourself() {
	System.out.println("Meine Name ist: "+getName());
		System.out.println("Ich übe die Sportart: "+getSport()+" aus!");
	}


}
