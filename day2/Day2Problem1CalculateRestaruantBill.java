import java.util.Scanner;

public class Day2Problem1CalculateRestaruantBill {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Price 1:");
		float p1=scan.nextFloat();
		System.out.println("Enter Price 2:");
		float p2=scan.nextFloat();
		System.out.println("Enter Price 3:");
		float p3=scan.nextFloat();
		System.out.println("Enter tax percentage:");
		float tax=scan.nextFloat();
		float sum=p1+p2+p3;
		float total=(1+tax/100)*sum;
		System.out.println("Final Amount:"+total);
		
	}
}
