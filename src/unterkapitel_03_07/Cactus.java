package unterkapitel_03_07;

public class Cactus extends Plant {

	private double weigth;
	public Cactus(String species, double weigth) {
		super(species);
		this.weigth = weigth;
	}
	

	 public double getWeigth() {
		 return weigth;
	 } 
}

