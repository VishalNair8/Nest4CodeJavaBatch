import java.util.Scanner;

public class Day3Problem1ConvertSecondsToTime {
	public static void main(String[] args) {
		System.out.println("Enter the time in seconds::");
		Scanner scan=new Scanner(System.in);
		int t = scan.nextInt();
		int d= t/86400;
		int h=(t%86400)/3600;
		int m=((t%86400)%3600)/60;
		int s=((t%86400)%3600)%60;
		System.out.print(+d);
		System.out.print("Days");
		System.out.print(+h);		
		System.out.print("Hours");
		System.out.print(+m);		
		System.out.print("Minutes");
		System.out.print(+s);
		System.out.print("Secomds");
		System.out.println();


	}

}
