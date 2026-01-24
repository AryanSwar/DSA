package functionAndMethods7;

public class BinaryToDecimal4 {
	public static void binToDec(int binNum) {
		int myNum = binNum;
		int pow = 0;
		int decNum = 0;
		while(binNum>0) {
			int lastdigit = binNum%10;
			decNum = decNum+(int)(lastdigit*Math.pow(2,pow));
			binNum = binNum/10;
			pow++;
		}
		System.out.println("decimal of "+myNum+" =  "+decNum);
	}
	public static void main(String[] args) {
		int n = 1001;
		binToDec(n);
	}
}
