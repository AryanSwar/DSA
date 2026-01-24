package patternsPart_1Patterns6;

public class HalfPyramidPattern3 {
	public static void main(String[] args) {
		//Print Half Pyramid Pattern
		/*
		 * 		1
				12
				123
				1234
		 */
		
		
		int n = 4;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}