package loopsFlowControl5.PracticeQuestion;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		//Question 2: Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
		
		Scanner sc = new Scanner(System.in);
		int number;
		int choice;
		int even_sum = 0;
		int odd_sum = 0;
		do {
			System.out.print("Enter the number : ");
			number = sc.nextInt();
			
			if(number % 2 == 0) {
				even_sum += number;
			}
			else {
				odd_sum += number;
			}
			System.out.print("Do you want to continue? Press 1 for yes or 0 for no : ");
			
			choice = sc.nextInt();
			
		}while(choice == 1);
		System.out.println("Sum of even numbers : "+even_sum);
		System.out.println("Sum of odd numbers : "+odd_sum);
	}
}
