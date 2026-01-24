package conditionalStatements4;

public class PrintTheLargestOf3Nums6 {
	public static void main(String[] args) {
		int A = 1;
		int B = 3;
		int C = 6;
		if(A >= B && A >= C) {
			System.out.println("A is Largest of 3.");
		}
		else if(B >= C) {
			System.out.println("B is Largest of 3.");
		}
		else {
			System.out.println("C is Largest of 3.");
		}
	}
}
