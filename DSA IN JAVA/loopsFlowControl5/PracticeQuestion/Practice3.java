package loopsFlowControl5.PracticeQuestion;
import java.util.Scanner;
public class Practice3 {
	public static void main(String[] args) {
		//Question 3 :Write a program to find the factorial of any number entered by the user.
		
		//(Hint : factorial of a number n = n*(n-1)*(n-2)*(n-3)*……*1 and exists for positive numbers
		// 		  only. We write factorial as n!
		//		  So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
		//		  Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any positive integer number : ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=n; i>0;i--) {
			fact *= i;
		}
		System.out.println("Factorial of "+n+" is : "+fact);
	}
}
