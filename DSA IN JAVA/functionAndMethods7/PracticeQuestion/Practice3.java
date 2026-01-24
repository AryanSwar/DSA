package functionAndMethods7.PracticeQuestion;
//Ques-3.Write a java program to check if a number is palindrome in java?(121 is a palindrome, 321 is not)
//A number is called palindfrome if the number is equal to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. on the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.
public class Practice3 {
	public static boolean checkPalindrome(int n) {
		int n1 = n;
		int revnum = 0;
		while(n>0) {
			int lastdigit = n%10;
			revnum = revnum*10+lastdigit;
			n = n/10;
		}
		if(n1 != revnum) {
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		int n = 121;
		boolean res = checkPalindrome(n);
		if(res == true) {
			System.out.println("Palindrome Number.");
		}
		else {
			System.out.println("Not Palindrome Number.");
		}
	}
}
