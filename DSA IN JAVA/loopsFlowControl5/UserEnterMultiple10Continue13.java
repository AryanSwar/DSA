package loopsFlowControl5;
import java.util.Scanner;

public class UserEnterMultiple10Continue13 {
	public static void main(String[] args) {
		//Question : Display all numbers entered by user except multiple of 10.
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.print("Enter your number : ");
			int n = sc.nextInt();
			if(n % 10 == 0) {
				continue;
			}
			System.out.println(n);
			
		}while(true);
	}
}
