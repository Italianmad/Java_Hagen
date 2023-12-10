package unterkapitel_03_09;

public class DBKonto implements AccountInterface {
	
	
	private float total;
	private String name;
	private float amount;
	
	public DBKonto(String name, float total, float amount) {
		this.name = name;
		this.amount = amount;
		this.total = total;
	}
	
	public void setTotal(int t) {
		total = t;
	}
	
	public int getTotal() {
		return (int) total;
	}
	
	public String getAccountHolder () {
		return name;
	}
	
	public int getBalance () {
		return (int) total;
	}
	public void withdraw (float amount) {
		total -= (int) amount;
	}
	public void payIn (float amount) {
		total +=  (int) amount;
	
	}
}


