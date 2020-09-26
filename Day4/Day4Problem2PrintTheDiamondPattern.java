import java.util.Scanner;

public class Day4Problem2PrintTheDiamondPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= scan.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		} 
		for(int i=0;i<=n;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print("*");

		}
			System.out.println("");

		}
		
	}

}
