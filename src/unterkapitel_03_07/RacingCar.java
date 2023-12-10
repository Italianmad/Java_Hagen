package unterkapitel_03_07;

public class RacingCar extends Car implements Weighable{
	private int horsePower;
	
	public RacingCar(double weigth, int horsePower) {
		super(weigth);
		this.horsePower = horsePower;
	}
	
	public int getHP() {
		return horsePower;
	}

}
