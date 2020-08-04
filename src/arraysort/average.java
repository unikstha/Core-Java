package arraysort;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		System.out.println("***** Finding the average of three numbers *****");

		Scanner scan = new Scanner(System.in);

		System.out.println("\nEnter the first number: ");
		double num1 = scan.nextDouble();

		System.out.println("\nEnter the second number: ");
		double num2 = scan.nextDouble();

		System.out.println("\nEnter the third number: ");
		double num3 = scan.nextDouble();
		scan.close();

		System.out.println("\nThe average of entered numbers is: " + avr(num1, num2, num3));
	}

	public static double avr(double a, double b, double c) {
		return (a + b + c) / 3;
	}
}