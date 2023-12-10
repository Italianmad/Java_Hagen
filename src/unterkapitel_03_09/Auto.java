package unterkapitel_03_09;

public class Auto {
	
	private float speed;
	
	public void setSpeed (float s) {
		if (s>=0.0 && s<=220.0) speed = s;
	}
	
	
	public void decreaseSpeed () {
		speed -= 25.0;
	}
}
