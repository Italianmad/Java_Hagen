package unterkapitel_03_09;

public abstract class Employee {
	
	private String name;
	public Employee (String n) {
		setName (n);
	}
	
	public abstract float getSalary ();
	
	public void setName (String n) {
		name = n;
	}
	
	public String getName () {
		return name;
	}
	public String toString () {
		return "Hallo! Mein Name ist "+getName ()+"! "+
		"Ich verdiene "+getSalary ()+" ?!";
	}
}
