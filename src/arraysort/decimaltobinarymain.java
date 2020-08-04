package arraysort;

import java.util.Scanner;

public class decimaltobinarymain {

	public static void main(String args[]) {
		System.out.println("*****Decimal to binary number conversion by iteration*****");
		System.out.println("\nEnter a number: ");
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		
		System.out.println("\nBinary is:");
		decimaltobinary1.decimaltobinary(a);
	}
}
