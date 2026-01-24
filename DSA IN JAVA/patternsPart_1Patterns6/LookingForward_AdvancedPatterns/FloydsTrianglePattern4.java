package patternsPart_1Patterns6.LookingForward_AdvancedPatterns;

public class FloydsTrianglePattern4 {
	public static void main(String[] args) {
		//Floyd's Triangle Pattern
		/*
		 * 		1  
				2  3  
				4  5  6  
				7  8  9  10 
				11 12 13 14 15 
		 */
		
		int n = 5;
		int count = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
		//using if-else for adjusting the spaces in two digit number like-10
				if(count >= 10) {
					System.out.print(count++ +" ");
				}
				else {
					System.out.print(count++ +"  ");
				}
			}
			System.out.println();
		}
	}
}
