package unterkapitel_02_06;

public class MagischesQuadrat {
	public static void main (String args[]) {
	int[][] magischesQuadat = { {8,1,6}, 
								{3,5,7}, 
								{4,9,2} };
	int sumHor = 0;
	int sumCol = 0;
	int sumDiag = 0;
	for(int r=0; r < magischesQuadat.length; r++) {
		for(int c=0; c < magischesQuadat[r].length; c++) {
			if (r ==0) {
			sumHor += magischesQuadat[r][c];
			
			}
			if (c == 0) {
				sumCol += magischesQuadat[r][c];
				
			}
			if (c==r) {
				sumDiag += magischesQuadat[r][c];

			}
		}
	 }
	System.out.println("Sum of the numbers in the row is: "+sumHor);
	System.out.println("Sum of the numbers in the column is: "+sumCol);
	System.out.println("Sum of the numbers in the column is: "+sumDiag);
	}
}