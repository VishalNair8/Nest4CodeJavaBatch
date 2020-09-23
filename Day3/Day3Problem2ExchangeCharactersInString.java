import java.util.Scanner;

public class Day3Problem2ExchangeCharactersInString {
	public static void main(String[] args) {
		//input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1 = scan.nextLine();
		System.out.println("Enter the string 2: ");
		String s2 = scan.nextLine();
		//logic
		String o1= s2.substring(s2.length()-2,s2.length())+s1.substring(2,s1.length()-2)+s2.substring(0,2);
		String o2= s1.substring(s1.length()-2,s1.length())+s2.substring(2,s2.length()-2)+s1.substring(0,2);
		//output
		System.out.println("Exchanged value for string 1:" +o1);
		System.out.println("Exchanged value for string 2:" +o2);
	}
}