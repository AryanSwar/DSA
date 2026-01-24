package variableAndDatatypes2.PracticeQuestion;

import java.util.Scanner;

//Question2:In a program,input the side of a square.You have to output the area of the square.
//(Hint : area of a square is (side x side))
public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enete the side of the square : ");
		int side = sc.nextInt();
		int area_square = side*side;
		System.out.println("Area of Square is : "+area_square);
	}
}
