package part2Arrays10;

public class MaxSubArraySumUsing_BruteForce_1 {
	public static void maxSubArraySum(int numbers[]) {
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i;j<numbers.length;j++) {
				currSum = 0;
				for(int k=i;k<=j;k++) {
					currSum += numbers[k];
				}
				if(maxSum < currSum) {
					maxSum = currSum;
				}
				System.out.println(currSum);
			}
		}
		System.out.println("Maximum sum of subarray is : "+maxSum);
	}
	public static void main(String[] args) {
		
		int numbers[] = {1,-2,6,-1,3};
		maxSubArraySum(numbers);
		
//		int max = Integer.MIN_VALUE;
//		int num[] = {1,-2,6,-1,3};
//		for(int i=0;i<num.length;i++) {
//			for(int j=i;j<num.length;j++) {
//				int sum = 0;
//				for(int k=i;k<=j;k++) {
//					sum += num[k];
//				}
//				System.out.println(sum);
//				if(max<sum) {
//					max = sum;
//				}
//			}
//		}
//		System.out.print("maximum of the sum of subarray is : "+max);
	}
}
