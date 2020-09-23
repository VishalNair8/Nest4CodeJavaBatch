import java.util.Scanner;

public class Day2problem2HeightAndWeightConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Height (Feet Part):");
		double h1= scan.nextDouble();
		System.out.println("Enter Height (Inch Part):");
		double h2= scan.nextDouble();
		System.out.println("Enter Weight in Kg:");
		double w= scan.nextDouble();
		double weight=w*2.2;
		double height=(h1*12+h2)*2.54;
		System.out.println("Height in cm:"+height);
		System.out.println("Weight in pounds:"+weight);
	}

}