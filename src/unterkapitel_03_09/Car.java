package unterkapitel_03_09;

public class Car extends Vehicle {
	private float speed;
	
	public Car () {
		setSpeed (0);
	}
	
	public void setSpeed (float s) {
		speed = s;
	}
	
	public float getSpeed () {
		return speed;
	}
}
