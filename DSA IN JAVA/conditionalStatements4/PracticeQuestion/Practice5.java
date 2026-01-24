package conditionalStatements4.PracticeQuestion;
import java.util.Scanner;
public class Practice5 {
	public static void main(String[] args) {
		//Question 5:Write a Java program that takes a year from the user and print whether that year is a leap year or not.
		//hints - is year divisible by 4?-yes then is year is divisible by 100?-yes then is year is divisible by 400?-yes ans - leap year
		//is year divisible by 4?-not ans - not a leap year
		//is year divisible by 100?-not ans - leap year
		//is year divisible by 400?-not ans - not a leap year
		
		//Here is a list of leap years: 1900,1904,1920,1924,1928,1932,1936,1940,1944,1948,1952,1956,1960,1964
		//								1968,1972,1976,1980,1984,1988,1992,1996,2000,2004,2008,2012,2016,2020,2024
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a year : ");
		int year = sc.nextInt();
		
		boolean x = (year % 4) == 0;
		boolean y = (year % 100) != 0;
		boolean z = (year % 400) == 0;
		
		if(x && (y || z)) {
//		if((x && y) || z){	
			
			System.out.println(year+" : is a leap year.");
		}
		else {
			System.out.println(year+" : is not a leap year.");
		}
	}
}
