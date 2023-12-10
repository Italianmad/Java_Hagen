package unterkapitel_03_09;

public class Pair1<T> {

		private T one;
		private T theOther;
		
		public Pair1(T one, T theOther) {
			this.one = one;
			this.theOther = theOther;
		}
			
		
		public T getOne() {
			return one;
		}
		
		public T getTheother() {
			return theOther;
		}

}
