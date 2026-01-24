package loopsFlowControl5;
import java.util.Scanner;
public class UserEnterMultiple10Break11 {
	public static void main(String[] args) {
		//Keep entering numbers till user enters a multiple of 10.
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter the number : ");
			int n = sc.nextInt();
			
			if(n%10 == 0) {
				break;
			}
			System.out.println(n);
		}while(true);
	}
}