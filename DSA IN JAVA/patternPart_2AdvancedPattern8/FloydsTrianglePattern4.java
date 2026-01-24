package patternPart_2AdvancedPattern8;

public class FloydsTrianglePattern4 {
	/*
	 * 			1  
				2  3  
				4  5  6  
				7  8  9  10 
				11 12 13 14 15 
	 */
	
	public static void floydsTriangle(int n) {
		int count = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(count>=10) {
					System.out.print(count++ +" ");
				}
				else {
					System.out.print(count++ +"  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		floydsTriangle(6);
	}
}
