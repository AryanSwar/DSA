package part1Arrays9;

public class FindMaximumSumOfSubArray8 {
	public static void maximumSumSubArray(int numbers[]) {
		int max = 0;
		int tSubArr = 0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i;j<numbers.length;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {
					sum = sum + numbers[k];
					System.out.print(numbers[k]);
					
				}
				System.out.print(" sum of subarry is : "+sum);
				if(max<sum) {
					max = sum;
				}
				tSubArr++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total subarray : "+tSubArr);
		System.out.println("maximum sum of subarray is : "+max);
	}
	public static void main(String[] args) {
		int numbers[] = {2,4,6,8,10};
		maximumSumSubArray(numbers);
	}
}
