package conditionalStatements4;

public class IfElseStatement1 {
	public static void main(String[] args) {
		//age 18 - vote, drive, college
		int age = 22;
		if(age >= 18) {
			System.out.println("adult : vote, drive");
		}
		if(age > 13 && age < 18) {
			System.out.println("teenager");
		}
		else {
			System.out.println("not adult");
		}
	}
}
