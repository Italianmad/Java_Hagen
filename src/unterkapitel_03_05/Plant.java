package unterkapitel_03_05;

public class Plant {
	private float sizeInCm;
	
	protected void grow(float cm) {
		if (cm>0) sizeInCm+= cm;
		
	}
	
	private void water(int liter) {
		grow(liter*0.1f);
		
	}
	

}
