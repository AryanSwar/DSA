package loopsFlowControl5;

public class BreakStatement10 {
	public static void main(String[] args) {
		//Question : print the number 1 to 5 when 3 is come stop the execution.
		
		for(int i = 1; i <= 5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("i am out of the loop.");
	}
}
