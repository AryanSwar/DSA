package functionAndMethods7;

public class PrintAllPrimeInRange3 {
	public static boolean checkPrime(int n) {
		if(n == 2) {
			return true;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int n = 20;
		for(int i=2;i<=n;i++) {
			//1st approach
//			boolean b = checkPrime(i);
//			if(b == true) {
//				System.out.println(i);
//			}
			
			
			//2nd approach
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
