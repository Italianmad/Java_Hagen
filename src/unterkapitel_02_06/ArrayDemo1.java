package unterkapitel_02_06;

public class ArrayDemo1 {
	public static void main (String args[]) {
	double [] collection;
	// double d [];
	
	collection = new double[3];
	collection [0]= 4.0;
	collection [1]= 3.0;
	collection [2]= collection [0]*2;
	// d= new double[2];
	// d[0]= 6;
	double e [] = new double[8];
	for(int i=0; i<e.length; i++) {
		e[i]=i+1;
	}
	System.out.println(e[0]);
	
	String direction []= {"Norden", "Osten", "Sueden", "Westen"}; // new goes away in this case
	for(int i=0; i<direction.length; i++) {
	System.out.println(direction[i]);}
	
	System.out.println("erstes Element enthält: "+ collection[0]);
	System.out.println("zweites Element enthält: "+ collection[1]);
	System.out.println("drittes Element enthält: "+ collection[2]);
	}	

}
