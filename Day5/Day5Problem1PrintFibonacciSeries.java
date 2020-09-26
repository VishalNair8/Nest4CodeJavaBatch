import java.util.Scanner;

public class Day5Problem1PrintFibonacciSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input n:");
		int no = scan.nextInt();
		//System.out.println(+no);
		int n[]= new int[no];
		n[0]=0;
		//System.out.println(n[0]);
		n[1]=1;
		//System.out.println(n[1]);
		//System.out.println(n[no]);
		for (int i=2;i<no;i++) {
			n[i]=n[(i-1)]+n[(i-2)];
		}

		for (int i=0;i<no;i++) {
			System.out.print(n[i]+ " ");
		}
	}

}
