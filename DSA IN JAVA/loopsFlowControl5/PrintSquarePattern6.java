package loopsFlowControl5;

public class PrintSquarePattern6 {
	public static void main(String[] args) {
		//Ques : Print square pattern.
		//		****
		//		****
		//		****
		//		****
		
		// using for loop
//		for(int line = 1; line <= 4; line++) {
//			System.out.println("****");
//		}
		
		// using while loop
		int line = 1;
		while(line <= 4) {
			System.out.println("****");
			line++;
		}
	}
}
