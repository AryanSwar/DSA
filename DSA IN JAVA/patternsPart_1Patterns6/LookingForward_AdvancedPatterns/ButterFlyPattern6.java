package patternsPart_1Patterns6.LookingForward_AdvancedPatterns;

public class ButterFlyPattern6 {
	public static void main(String[] args) {
		/*
		 * 			*      *
					**    **
					***  ***
					********
					********
					***  ***
					**    **
					*      *
		 */

		int n = 4;
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=n-i;k++) {
				System.out.print("  ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<i;k++) {
				System.out.print("  ");
			}
			for(int l=1;l<=n+1-i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
