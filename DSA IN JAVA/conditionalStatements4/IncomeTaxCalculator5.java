package conditionalStatements4;
import java.util.Scanner;

public class IncomeTaxCalculator5 {
	public static void main(String[] args) {
		
		//income < 5L -> 0% tax
		//income between 5-10L -> 20% tax
		//income > 10L -> 30% tax
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your income : ");
		int income = sc.nextInt();
		int tax;
		
		if(income < 500000) {
			tax = 0;
		}
		else if(income >= 500000 && income < 1000000) {
			tax = (income * 20)/100;
			
		}
		else{
			tax = (income * 30)/100;
			
		}
		System.out.println("your tax amount is : "+tax);
	}
}
