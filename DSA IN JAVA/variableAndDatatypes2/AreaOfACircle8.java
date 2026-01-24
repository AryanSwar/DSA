package variableAndDatatypes2;
import java.util.Scanner;
public class AreaOfACircle8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radious of a circle : ");
		float rad = sc.nextFloat();
		float area = 3.14f*rad*rad;
		System.out.println("Area of a circle is : "+area);
	}
}
