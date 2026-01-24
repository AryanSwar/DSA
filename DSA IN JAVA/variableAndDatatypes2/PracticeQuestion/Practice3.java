package variableAndDatatypes2.PracticeQuestion;

import java.util.Scanner;

//Question3:Enter cost of 3 items from the user(using float data type)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the pencil price : ");
		float pencil = sc.nextFloat();
		System.out.print("Enter the pen price : ");
		float pen = sc.nextFloat();
		System.out.print("Enter the eraser price : ");
		float eraser = sc.nextFloat();
		float total_cost = pencil + pen + eraser;
		
		System.out.println("Bill is : "+total_cost);
		
		//Adding 18% GST in the bill
		float final_bill = total_cost+((total_cost*18)/100);
		System.out.println("Bill with 18% GST : "+final_bill);
	}
}
