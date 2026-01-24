package part1Arrays9;

public class ReverseAnArray5 {
	public static void reverseArray(int number[]) {
		int i = 0;
		int j = number.length-1;
		while(i<j) {
			int temp = number[i];
			number[i] = number[j];
			number[j] = temp;
			i++;
			j--;
		}
		for(int x : number) {
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		int number[] = {2,4,6,8,10};
		reverseArray(number);
	}
}
