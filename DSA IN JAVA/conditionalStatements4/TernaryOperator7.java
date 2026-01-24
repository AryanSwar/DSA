package conditionalStatements4;

public class TernaryOperator7 {
	public static void main(String[] args) {
		
//		int larger = (5 > 3)? 5 : 3 ;
		
		int a = 5;
		int b = 3;
		
		int larger = (a > b)? a : b ;
		System.out.println(larger);
		
//		String type = (5 % 2 == 0)? "even" : "odd";
		
		String type = (a % 2 == 0)? "even" : "odd";
		System.out.println(type);
		
	}
}
