package patternsPart_1Patterns6.LookingForward_AdvancedPatterns;

public class PalindromicPatternWithNumbersPattern11 {
	public static void main(String[] args) {
		/*
		 * 				    1
						   212
						  32123
						 4321234
						543212345
		 */
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(((i+1)-k));
			}
			if(i!=1) {
				for(int l=2;l<=i;l++) {
					System.out.print(l);
				}
			}
			System.out.println();
		}
	}
}
