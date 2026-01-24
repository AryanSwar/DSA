package conditionalStatements4.PracticeQuestion;

public class Practice4 {
	public static void main(String[] args) {
		//Question 4 :What will be the value of x & y in the following program:
		//int a = 63, b = 36;
		//boolean x = (a < b) ? true : false;
		//int y = (a > b) ? a : b;
		
		int a = 63, b = 36;
		boolean x = (a < b) ? true : false;
		int y = (a > b) ? a : b;
		
		System.out.println(x);	//false
		System.out.println(y);	//63
		
	}
}
