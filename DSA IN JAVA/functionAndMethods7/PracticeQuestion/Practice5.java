package functionAndMethods7.PracticeQuestion;
//Ques-5.Write a java method to compute the sum of the digits in an integer.
/*
 * (Hint: Approach this question in the following way:
 * a. Take a variable sum = 0
 * b. Find the last digit of the number
 * c. Add it to the sum
 * d. Repeat a & b until the number becomes 0)
 */
public class Practice5 {
	public static int sumDigit(int n) {
		int sumOfDigits = 0;
		while(n>0) {
			int lastdigit = n % 10;
			sumOfDigits = sumOfDigits + lastdigit;
			n = n / 10;
		}
		return sumOfDigits;
	}
	public static void main(String[] args) {
		System.out.println("The sum is : "+sumDigit(123456));
	}
}