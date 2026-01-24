package functionAndMethods7;

public class CheckIfNumIsPrimeOrNot2 {
	
	//4th method
	public static boolean checkPrime(int n) {
		if(n == 2) {
			return true;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i ==0) {
				return false;
			}
		}
		return true;
	}
	
	//3rd method
	//only for n>=2 
//	public static boolean checkPrime(int n) {
//		//corner case
//		//for n = 2
//		
//		if(n == 2) {
//			return true;
//		}
//		for(int i = 2; i<=n-1; i++) {
//			if(n%i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	//using function 2nd method
//	public static boolean checkPrime(int n) {
//		
//		for(int i=2;i<=n-1;i++) {
//			if(n%i == 0) {
//				return false;
//				
//			}
//			
//		}
//		return true;
//	}
	public static void main(String[] args) {
		
		//1st method
//		int n = 5;
//		int count = 0;
//		for(int i=1;i<=5;i++) {
//			if(n%i == 0) {
//				count++;
//			}
//		}
//		if(count == 2) {
//			System.out.println("Prime");
//		}
//		else {
//			System.out.println("Not Prime");
//		}
		
		
		//2nd method
		System.out.println(checkPrime(4));
		
	}
}
