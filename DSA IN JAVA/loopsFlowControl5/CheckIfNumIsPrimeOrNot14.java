package loopsFlowControl5;
import java.util.Scanner;

public class CheckIfNumIsPrimeOrNot14 {
	public static void main(String[] args) {
		//Question : check if a number is prime of not.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Prime number.");
		}
		else {
			System.out.println("not prime number.");
		}
	}
}
