package part2Arrays10;

public class MaxSubArraySumUsing_PrefixSum_2 {
	public static void maxSumSubArray(int numbers[]) {
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		int prefixSum[] = new int[numbers.length];
		prefixSum[0] = numbers[0];
		for(int i=1;i<prefixSum.length;i++) {
			prefixSum[i] = prefixSum[i-1]+numbers[i];
		}
		
		
		
		for(int i=0;i<prefixSum.length;i++) {
			int start = i;
			for(int j=i;j<prefixSum.length;j++) {
				int end = j;
				if(start == 0) {
					currSum = prefixSum[end];
				}
				else {
					currSum = prefixSum[end]-prefixSum[start-1];
				}
				if(maxSum<currSum) {
					maxSum = currSum; 
				}
				
			}
		}
		System.out.println("Maximum sum of subarray is : "+maxSum);
	}
	public static void main(String[] args) {
//		int numbers[] = {1,-2,6,-1,3};
//		maxSumSubArray(numbers);
		
		
		
		
//		int currSum = 0;
//		int maxSum = Integer.MIN_VALUE;
//		int numbers[] = {1,-2,6,-1,3};
//		int prefixSum[] = new int[numbers.length];
//		prefixSum[0] = numbers[0];
//		for(int i=1;i<prefixSum.length;i++) {
//			prefixSum[i] = prefixSum[i-1]+numbers[i];
//		}
//		for(int i=0;i<prefixSum.length;i++) {
//			int start = i;
//			for(int j=i;j<prefixSum.length;j++) {
//				int end = j;
//				if(start == 0) {
//					currSum = prefixSum[end];
//				}
//				else {
//					currSum = prefixSum[end] - prefixSum[start-1];
//				}
//				if(currSum>maxSum) {
//					maxSum = currSum;
//				}
//			}
//		}
//		System.out.println("maximum sum of the sum array is : "+maxSum);
	}
}
