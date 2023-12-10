package unterkapitel_03_05;

public class Animal {
	
	private String order;
	
	public Animal(String order) {
	
		this.order = order;
		
	} // now there no implicit constructor available. No instance () would be possible!!! 
	
	
	
	
	public void setOrder(String order) {
		this.order = order;
	}
	
	public String getOrder()
	{
		return order;
	}
	
	


}
