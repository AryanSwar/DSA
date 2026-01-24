package variableAndDatatypes2;

public class TypeCasting10 {
	public static void main(String[] args) {
		float a = 25.12f;
		int b = (int)a;
		System.out.println(b);
		
		float marks = 99.99f;
		int marks2 = (int) marks;
		System.out.println(marks2);	//in coding no round off value
		
		
		char ch = 'a';
		char ch2 = 'b';
		int number = ch;
		int number2 = ch2;
		System.out.println(number);
		System.out.println(number2);
	}
}
