package conditionalStatements4.PracticeQuestion;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		
		//Question2:Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
		//hint - double temp = 103.5;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you body temperature : ");
		double temp = sc.nextDouble();
		if(temp > 100) {
			System.out.println("You have a fever.");
		}
		else {
			System.out.println("You don't have a fever.");
		}
	}
}
