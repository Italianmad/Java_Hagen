package unterkapitel_03_05;

public class Dog extends Animal{
	private String breed;
	
	
	public Dog (String breed) {
		super("Carnivora"); // from the upperclass always written as first and just 1 super
		setBreed(breed); // from this class
	}
	
	public void setBreed(String r) {
		breed = r;
	}
	
	public String getBreed() {
		return breed;
	}

}
