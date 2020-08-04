package arraysort;

import java.util.Scanner;

public class decimaltobinary2 {

	public static void main(String args[]) {
		System.out.println("*****Decimal to binary number conversion by predefined method*****");
		System.out.println("\nEnter a number: ");
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		
		System.out.println("\nBinary representation of " + a + " : " + Integer.toBinaryString(a));
	}
}
