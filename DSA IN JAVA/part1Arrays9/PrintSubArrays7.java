package part1Arrays9;

public class PrintSubArrays7 {
	public static void printSubArray(int numbers[]) {
		int tSubArr = 0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i;j<numbers.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(numbers[k]);
				}
				tSubArr++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total subarray : "+tSubArr);
	}
	public static void main(String[] args) {
		int numbers[] = {2,4,6,8,10};
		printSubArray(numbers);
		
//		int tsa = 0;
//		int num[] = {2,4,6,8,10};
//		for(int i=0;i<num.length;i++) {
//			for(int j=i;j<num.length;j++) {
//				System.out.print("[");
//				for(int k=i;k<=j;k++) {
//					System.out.print(num[k]);
//				}
//				System.out.print("] ");
//				tsa++;
//			}
//			System.out.println();
//		}
//		
//		System.out.println("total sub array : "+tsa);
	}
}
