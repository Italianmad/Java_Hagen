package unterkapitel_03_08.figures;

public class Rectangle extends Figure {
	private double width,height;
	
	public Rectangle(double width, double height) {
		this.width= width;
		this.height = height;
	}
	
	public void SetWidth(double lengthside) {
		if (lengthside>0)
		 width = lengthside;
	}
	
	public double GetWidth() {
		return width;
	}
	
	public void SetHeight(double h) {
		if (h>0)
			height = h;
	}
	
	public double GetB() {
		return height;
	}
	
	public double getArea() {
		return width*height;

	}
	
	
	public double getPerimeter() {
		return 2*(width+height);

	}
	
	public String toString() {
		return "Rechteck mit den Seitenlängen "+ width + " und "+ height;
	}
	
	
}
