package unterkapitel_02_06;

public class ArrayDemo2 {
	public static void main (String args[]) {
		int [] z = new int [3];
		double count = 0;
		for(int i=0; i<3;i++) {
			System.out.println("Bitte geben Sie die "+ (i+1) + ". Zahl ein: ");
			z[i] = readInt();
			count += z[i];
		}
		System.out.println("Der Durchschnitt Ihrer Eingaben beträgt "+Double.valueOf((count/z.length)));
		
	}
	
	public static int readInt() {
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try{return Integer.parseInt(br.readLine());}
		catch(Exception ex) {return 0;}
	}
	
}
