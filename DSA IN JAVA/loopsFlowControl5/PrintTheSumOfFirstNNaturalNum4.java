package loopsFlowControl5;
import java.util.Scanner;
public class PrintTheSumOfFirstNNaturalNum4 {
	public static void main(String[] args) {
		//Ques : Print the first n natural number.
		//Natural number Start from 1.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i <= n) {
			sum+=i;
			i++;
		}
		System.out.println("Sum of first n natural number is : "+sum);
	}
}
