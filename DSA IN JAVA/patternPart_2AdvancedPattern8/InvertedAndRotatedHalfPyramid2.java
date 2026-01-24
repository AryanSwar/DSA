package patternPart_2AdvancedPattern8;

public class InvertedAndRotatedHalfPyramid2 {
	/*
	 * 		   *
			  **
			 ***
			****
	 */
	public static void invertedRotatedHalfPyramid(int totRow, int totCol) {
		for(int i=1;i<=totRow;i++) {
			for(int j=1;j<totCol+1-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		invertedRotatedHalfPyramid(4, 4);
	}
}
