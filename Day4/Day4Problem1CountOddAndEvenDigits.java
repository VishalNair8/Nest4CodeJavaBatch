import java.util.Scanner;

public class Day4Problem1CountOddAndEvenDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		String input = scan.next();
		int o=0;
		int e=0;
		for (int i=0;i<input.length();i++) {
			if (input.charAt(i)%2==0){
			e++;
			}
			if (input.charAt(i)%2!=0){
				o++;
				}
		}
		int odd=input.length()-e;
		System.out.println("Odd digit:"+odd);
		System.out.println("Even digit:"+e);
				
	}

}
