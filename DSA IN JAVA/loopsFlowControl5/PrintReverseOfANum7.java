package loopsFlowControl5;
import java.util.Scanner;
public class PrintReverseOfANum7 {
	public static void main(String[] args) {
		//Ques : Print reverse of a number.
		//	n = 10899
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		//1st method count the number and give the reverse number and store the number in variable
//		int n = sc.nextInt();
//		int num = n;
//		int count = 0;
//		int rev = 0;
//		while(num>0) {
//			count++;
//			num = num / 10;
//		}
//		for(int i = 1;i <= count;i++) {
//			int rem = n%10;
//			rev = rev*10+rem;
//			n = n/10;
//		}
//		System.out.println(rev);
		
		
		//2nd method
		int n = sc.nextInt();
		while(n > 0) {
			int last_digit = n % 10;
			n = n / 10;
			System.out.print(last_digit);
		}
	}
}
