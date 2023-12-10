package unterkapitel_03_05;

public class Programmer extends Person {
	private String programmingLanguage;
	
	public void setLanguage(String language) {
		programmingLanguage = language;
	}
	
	public String getLanguage() {
		return programmingLanguage;
	}
public void introduceYourself() {
		
		System.out.println("Mein Name ist: "+getName()+"!");
		System.out.println("Ich bin Programmierer\n für die Sprache: "+getLanguage()+"!");
	}

}
