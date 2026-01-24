package variableAndDatatypes2;
import java.util.Scanner;
public class InputInJava5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//String - next()
		String input = sc.next();
		System.out.println();
		
		//String - nextLine()
		String name = sc.nextLine();
		System.out.println(name);
		
		//int - nextInt()
		int number = sc.nextInt();
		System.out.println(number);
		
		//float - nextFloat()
		float price = sc.nextFloat();
		System.out.println(price);
		
		//byte - nextByte()
		byte number2 = sc.nextByte();
		System.out.println(number2);
		
		//double - nextDouble
		double price2 = sc.nextDouble();
		System.out.println(price2);
		
		//boolean - nextBoolean()
		boolean b = sc.nextBoolean();
		System.out.println(b);
		
		//short - nextShort()
		short number3 = sc.nextShort();
		System.out.println(number3);
		
		//long - nextLong()
		long phone_number = sc.nextLong();
		System.out.println(phone_number);
		
		// String - next()
		String s = sc.next();
		System.out.println(s.charAt(0));	//for char

		
	}
}
