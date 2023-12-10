package unterkapitel_03_09;

public class Pair2 <T1, T2> {

	private T1 one;
	private T2 theOther;
	
	public Pair2(T1 one, T2 theOther) {
		this.one = one;
		this.theOther = theOther;
	}
		
	
	public T1 getOne() {
		return one;
	}
	
	public T2 getTheother() {
		return theOther;
	}

}
