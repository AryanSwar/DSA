package conditionalStatements4;

public class ElseIfStatement4 {
	public static void main(String[] args) {
		
		//else if statement
		
		int age = 13;
		if(age >= 18) {
			System.out.println("adult");
		}
		else if(age >= 13 && age < 18) {
			System.out.println("teenager");
		}
		else {
			System.out.println("child");
		}
	}
}
