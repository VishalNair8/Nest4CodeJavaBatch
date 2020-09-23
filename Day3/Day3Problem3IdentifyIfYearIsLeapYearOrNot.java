import java.util.Scanner;

public class Day3Problem3IdentifyIfYearIsLeapYearOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//input
		System.out.println("Enter a date: ");
		double year= scan.nextDouble();
		//logic
		    if (year%100==0 && year%400==0){
		    	
		        System.out.println("Date in Leap Year");
		    }
		    else if (year%100!=0 && year%4==0){
		    	System.out.println("Date in Leap Year");
		    }else {
		    	System.out.println("Date Not in Leap Year");
		    }		    
	}
}
