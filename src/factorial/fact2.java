package factorial;

import java.util.Scanner;

public class fact2 {
	public static void main(String args[]) {

		System.out.println("Finding factorial of: ");

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		fact2 fact = new fact2();// recursive factorial
		int m = fact.fact(n);

		System.out.println("Factorial of " + n + " is: " + m + ".");
	}

	int fact = 1;

	public int fact(int n) {
		if (n == 0)
			return fact;
		else {
			fact = fact * n;
			fact(n - 1);
		}
		return fact;
	}

}
