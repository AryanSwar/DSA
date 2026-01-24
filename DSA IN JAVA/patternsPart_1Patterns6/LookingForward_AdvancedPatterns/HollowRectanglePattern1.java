package patternsPart_1Patterns6.LookingForward_AdvancedPatterns;

public class HollowRectanglePattern1 {
	public static void main(String[] args) {
		//Hollow Rectangle Pattern
		/*
		 * 		*****
				*   *
				*   *
				*****
		 */
		
		int r = 4;
		int c = 5;
		for(int i = 1; i <= r; i++) {
			for(int j = 1; j <= c; j++) {
				if(i == 1 || i == 4 || j == 1 || j == 5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
