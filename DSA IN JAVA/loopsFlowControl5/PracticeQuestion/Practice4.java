package loopsFlowControl5.PracticeQuestion;
import java.util.Scanner;

public class Practice4 {
	//Question 4: Write a program to print the multiplication table of a number N,entered by the user.

	public static void multiplicationTable(int n) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " * "+ i +" = "+n*i);
		}
	}
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		multiplicationTable(n);
		
		sc.close();
	}
}
