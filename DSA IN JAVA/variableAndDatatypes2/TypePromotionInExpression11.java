package variableAndDatatypes2;

public class TypePromotionInExpression11 {
	public static void main(String[] args) {
//		char a = 'a';
//		char b = 'b';
//		System.out.println((int)b);
//		System.out.println((int)a);
//		System.out.println(b-a); 	//1
		
//		char c = a-b; 	//int to char conversion loss data
		
		
		
//		short a = 5;
//		byte b = 25;
//		char c = 'c';
////		byte bt = a + b + c;  //error
//		
//		byte bt = (byte)(a + b + c);
//		System.out.println(bt);
		
		
		
		
//		int a = 10;
//		float b = 20;
//		long c = 25;
//		double d = 10;
//		double ans = a + b + c + d;
//		System.out.println(ans);
		
		
		
		
//		byte b = 5;
//		b = b*2;	//error because expression is internally convert to type promotion
//		System.out.println(b);
		
		
		byte b = 5;
		b = (byte)(b * 2);
		System.out.println(b);	//10
	}
}
