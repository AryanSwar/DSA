package variableAndDatatypes2;
import java.util.Scanner;
public class TypeConversion9 {
	public static void main(String[] args) {
		int a = 25;
		long b = a;
		System.out.println(b);	//it is possible,implicitly,widening
		
		Scanner sc = new Scanner(System.in);
		float num = sc.nextInt();
		System.out.println(num);
		
		
		
//		int num2 = sc.nextFloat();
//		System.out.println(num2);	//error
		
		
//		long a = 25;
//		int b = a;
//		System.out.println(b);	//error it is not possible,explicitly
		
	}
}
