package loopsFlowControl5;

public class ReverseTheGivenNum8 {
	public static void main(String[] args) {
		//Question : Reverse the given number.
		int n = 10899;
		int rev = 0;
		while(n > 0) {
			int last_digit = n % 10;
			rev = (rev*10)+last_digit;
			n = n / 10;
		}
		System.out.print(rev);
	}	
}
