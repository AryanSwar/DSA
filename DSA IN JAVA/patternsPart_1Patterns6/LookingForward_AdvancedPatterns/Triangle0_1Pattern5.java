package patternsPart_1Patterns6.LookingForward_AdvancedPatterns;

public class Triangle0_1Pattern5 {
	public static void main(String[] args) {
		//0-1 Triangle Pattern
		/*
		 * 
				1
				01
				101
				0101
				10101
		 */
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				if((i+j)%2 == 0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
