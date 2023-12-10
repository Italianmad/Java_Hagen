package unterkapitel_03_07;

public class Goldbar implements Weighable {

	private double weigth;
	 public Goldbar(double weigth) {
		 setWeigth(weigth);
	 }
	 
	 public void setWeigth(double w) {
		 weigth = w;
	 }

	 public double getWeigth() {
		 return weigth/1000.0;
	 }
}
