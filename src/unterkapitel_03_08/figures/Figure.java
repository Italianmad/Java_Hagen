package unterkapitel_03_08.figures;

public abstract class Figure {
	private int x,y;
	
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getÝ() {
		return y;
	}
	
	public abstract  double getArea();
	
	public abstract  double getPerimeter();

	public double AreaPerimeterRatio() {
		return getArea()/getPerimeter(); 
	}
}


