import java.util.Scanner;

public class Day5Problem2NextPrime {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner scan= new Scanner (System.in);
		int num=scan.nextInt();
		while (true) {
			num++;
			boolean result =isPrime(num);
			if (result) {
				System.out.println("Next primenumber is"+num);
				break;
			}
		}
	}
	public static boolean isPrime(int num) {
		System.out.println("Checking if number is prime "+num);
		int flag=0;
		for (int i=2;i<num;i++) {
			if (num%i==0) {
				flag =1;
				break;
			}
		}
		if (flag==1) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not a Prime number");
			
		}
		return false;
	
}
}
