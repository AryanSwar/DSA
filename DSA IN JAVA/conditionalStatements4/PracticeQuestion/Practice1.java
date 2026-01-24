package conditionalStatements4.PracticeQuestion;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		
		//Question1:Write a Java program to get a number from the user and print whether it is positive or negative.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("Positive number.");
		}
		else {
			System.out.println("Negative number.");
		}
	}
}
