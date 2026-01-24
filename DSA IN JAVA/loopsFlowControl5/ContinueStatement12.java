package loopsFlowControl5;

public class ContinueStatement12 {
	public static void main(String[] args) {
		
		//Question : print the 1 to n number when come 3 the skip the 3.
	
		//using continue keyword : it is use to skip an iteration.
		for(int i = 1; i <= 5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
	}
}
