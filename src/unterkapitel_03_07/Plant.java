package unterkapitel_03_07;

public abstract class Plant implements Weighable {
	
	private String species;
	
	public Plant(String species) {
		this.species = species;
	}
	
	public String getSpecies() {
		return species;
	}

}
