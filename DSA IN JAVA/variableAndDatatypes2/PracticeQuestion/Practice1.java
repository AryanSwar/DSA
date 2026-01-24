package variableAndDatatypes2.PracticeQuestion;
import java.util.Scanner;
//Question1: In a program, input 3 numbers:A,B and C.You have to output the average of these 3 numbers.
//(Hint : Average of N numbers is sum of those numbers divided by N)

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number : ");
		int c = sc.nextInt();
		int sum = a + b + c;
		int avg = sum/3;
		System.out.println("Average is : "+avg);
	}
}
