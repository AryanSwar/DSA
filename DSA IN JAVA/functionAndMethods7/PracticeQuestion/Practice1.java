package functionAndMethods7.PracticeQuestion;
//Ques-1.Write a java method to compute the average of three numbers.
public class Practice1 {
	public static void average(int n1,int n2, int n3) {
		int sum = n1+n2+n3;
		int avg = sum/3;
		System.out.println("average of three number is : "+avg);
	}
	public static void main(String[] args) {
		average(2, 3, 5);
	}
}
