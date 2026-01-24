package part2Arrays10;

public class MaxSubArraySumUsing_KadanesAlgorithm_3 {
	
//	public static void Kadanes(int[] numbers) {
//		int ms = Integer.MIN_VALUE;
//		int cs = Integer.MIN_VALUE;
//		for(int i=0;i<numbers.length;i++) {
//			cs = cs+numbers[i]; 
//			
//			if(ms<cs) {
//				ms = cs;
//			}
//		}
//		System.out.println("our max subarray sum is : "+ms);
//	}
	
	//this is solve all negative problem and solve 
	public static void Kadanes(int[] numbers) {
		int ms = numbers[0];
		int cs = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			cs = cs+numbers[i];
			if(cs<numbers[i]) {
				cs = numbers[i];
			}
			if(ms<cs) {
				ms = cs;
			}
		}
		System.out.println(ms);
	}
	public static void main(String[] args) {
		
		int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
		
//		int numbers[] = {-2,-3,-4,-6,-9};
		Kadanes(numbers);
	}

	
}
