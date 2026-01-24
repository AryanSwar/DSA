package patternsPart_1Patterns6;

public class IntroToNestedLoopsStarPattern1 {
	public static void main(String[] args) {
		/*
		 * 			*
		 * 			**
		 * 			***
		 * 			****
		 */
		
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
