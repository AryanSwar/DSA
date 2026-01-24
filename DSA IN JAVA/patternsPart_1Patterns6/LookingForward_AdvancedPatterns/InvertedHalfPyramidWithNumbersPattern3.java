package patternsPart_1Patterns6.LookingForward_AdvancedPatterns;

public class InvertedHalfPyramidWithNumbersPattern3 {
	public static void main(String[] args) {
		//Inverted Half Pyramid With Numbers Pattern
		/*
		 * 		12345
				1234
				123
				12
				1
		 */
		
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
