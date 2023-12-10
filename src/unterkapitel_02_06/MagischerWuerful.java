package unterkapitel_02_06;

public class MagischerWuerful {
	public static void main (String args[]) {
	
	
	int magischerWuerfel[][][] = {
			{ { 2,15,25}, {24, 7,11}, {16,20, 6} },
			{ {18,19, 5}, { 1,14,27}, {23, 9,10} },
			{ {22, 8,12}, {17,21, 4}, { 3,13,26} }
			};
	int [] teilarray = magischerWuerfel[1][1];
	System.out.println("Zentrales Array ist: ["+teilarray[0]+ ", "+ teilarray[1]+ ", "+teilarray[2]+ "]");
	for(int i=0; i < magischerWuerfel.length; i++) {
		for(int j=0; j< magischerWuerfel[i].length; j++) {
			for(int k=0; k< magischerWuerfel[i][j].length;k++) {
				
				System.out.println("Elements [" + i + "][" + j + "][" + k + "] = " + magischerWuerfel[i][j][k]);
				
				
			}
			
		}
	}
	
	
	}
}
