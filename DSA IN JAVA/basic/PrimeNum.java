package basic;
// find if number is prime.
public class PrimeNum {
	public static void main(String[] args) {
		int n = 6;
		int div = 2;
		while(div<n) {
			if(n%div == 0) {
				System.out.println("NOT Prime");
			}
			else {
				System.out.println("prime");
			}
		}
		
	}
}
