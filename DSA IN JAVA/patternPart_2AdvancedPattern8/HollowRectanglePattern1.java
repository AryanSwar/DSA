package patternPart_2AdvancedPattern8;

public class HollowRectanglePattern1 {
	/*
	 * 		*****
			*   *
			*   *
			*****
	 */
	public static void hollowRactangle(int totRow, int totCol) {
		for(int i=1;i<=totRow;i++) {
			for(int j=1;j<=totCol;j++) {
				if(i == 1 || i == totRow || j == 1 || j == totCol) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int totRow = 4;
		int totCol = 5;
		hollowRactangle(totRow,totCol);
		
	}
}
