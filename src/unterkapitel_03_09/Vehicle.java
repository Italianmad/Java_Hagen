package unterkapitel_03_09;

public abstract class Vehicle implements Movable {
	private float pos;
	
	public Vehicle () {
		pos = 0;
	}
	
	
	public float getPosition () {
		return pos;
	}
	
	
	public void drive (int seconds) {
	pos += getSpeed () * seconds;
	}
}
