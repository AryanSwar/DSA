package conditionalStatements4;
import java.util.Scanner;

public class Calculator10 {
	public static void main(String[] args) {
//		System.out.println("Using calculator to calculate mathematical operation choose the option :");
//		
//		System.out.println("Options : ");
//		System.out.println("1. Addition.");
//		System.out.println("2. Multiplication.");
//		System.out.println("3. Subtraction.");
//		System.out.println("4. Division.");
//		System.out.println("5. Reminder.");
//	
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the option : ");
//		
//		int opt = sc.nextInt();
//		System.out.println();
//		System.out.print("Enter 1st number : ");
//		
//		int num1 = sc.nextInt();
//		
//		System.out.print("Enter 2nd number : ");
//		
//		int num2 = sc.nextInt();
//		
//		System.out.println();
//		
//		switch(opt) {
//		case 1: 
//			System.out.print("Sum is : "+(num1+num2));
//			break;
//		case 2:
//			System.out.print("Multiplication is : "+(num1*num2));
//			break;
//		case 3:
//			System.out.print("Subtraction is : "+ (num1-num2));
//			break;
//		case 4:
//			try{
//				System.out.print("Division is : "+(num1/num2));
//			}catch(ArithmeticException e) {
//				System.out.println("Number can't divide by zero.");
//			}
//			break;
//		case 5:
//			System.out.print("Reminder is : "+(num1%num2));
//			break;
//		default :
//			System.out.println("Invalid input");
//		}
		
		
		
		//2nd method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		System.out.println("Enter Operator : ");
		char operator = sc.next().charAt(0);
		
		switch(operator) {
		case '+' : 
			System.out.println(a+b);
			break;
		case '*' : 
			System.out.println(a*b);
			break;
		case '-' : 
			System.out.println(a-b);
			break;
		case '/' : 
			System.out.println(a/b);
			break;
		case '%' : 
			System.out.println(a%b);
			break;
		default :
			System.out.println("Wrong operator");
			
		}
	}
}
