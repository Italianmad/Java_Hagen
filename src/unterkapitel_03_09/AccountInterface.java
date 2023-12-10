package unterkapitel_03_09;

public interface AccountInterface {

	public String getAccountHolder ();
	public int getBalance ();
	public void withdraw (float amount);
	public void payIn (float amount);
}
