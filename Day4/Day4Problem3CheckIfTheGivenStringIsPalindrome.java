import java.util.Scanner;

public class Day4Problem3CheckIfTheGivenStringIsPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String input=scan.next();
		int j=input.length();
		String reverseInput = "";
 		
		for (int i = input.length() - 1; i>= 0; i--) {
			reverseInput = reverseInput + input.charAt(i);
		}
		if (input.equals(reverseInput))
			System.out.println("Is Palindrome");
		else
			System.out.println("Not Palindrome.");
		}

}
