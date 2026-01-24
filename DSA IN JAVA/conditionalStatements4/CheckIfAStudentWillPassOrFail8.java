package conditionalStatements4;

public class CheckIfAStudentWillPassOrFail8 {
	public static void main(String[] args) {
		//marks >= 33 -> Pass
		//marks < 33 -> Fail
		
		
		//ternary operators
		int marks = 33;
		String result = (marks >= 33)? "Pass" : "Fail";
		System.out.println(result);
		
		
		//using if-else
		if(marks >=33) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
}
