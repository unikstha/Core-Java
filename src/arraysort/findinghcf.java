package arraysort;

public class findinghcf {
	static int hcf(int a, int b) {
		if (b == 0) // base case
			return a;
		return hcf(b, a % b); // recursive case
	}

	public static void main(String args[]) {

		int a = 98, b = 56;
		System.out.println("HCF of " + a + " and " + b + " is " + hcf(a, b)+".");
	}

}
