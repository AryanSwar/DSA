package part1Arrays9;

public class LargestNumberInArray3 {
	public static int largestNumber(int number[]) {
		int largNum = Integer.MIN_VALUE;
		for(int i=0;i<number.length;i++) {
			if(largNum < number[i]) {
				largNum = number[i];
			}
		}
		return largNum;
	}
	public static int minimumNumber(int number[]) {
		int miniNum = Integer.MAX_VALUE;
		for(int i=0;i<number.length;i++) {
			if(miniNum > number[i]) {
				miniNum = number[i];
			}
		}
		return miniNum;
	}
	public static void main(String[] args) {
		int number[] = {1,2,6,3,5};
		int result = largestNumber(number);
		int miniresult = minimumNumber(number);
		System.out.println("Minimum number is : "+miniresult);
		System.out.println("Largest number is : "+result);
	}
}
