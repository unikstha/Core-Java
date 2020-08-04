package factorial;

public class fact1 {
	public static void main(String args[]) {
		int factorial = fact(4);
		System.out.println("Factorial of 4 is: " + factorial + ".");
	}

//	static int fact(int n)
//		   {
//		       if(n==1){
//		         return 1;
//		       }
////Without creating object Using Recursion Function 
//		       return fact(n-1)* n;

	static int fact(int n) {
		int output;
		if (n == 1) {
			return 1;
		}
		// By creating object & Using Recursion Function
		output = fact(n - 1) * n;
		return output;

	}
}
 
//Monday July 6, 2020: decimal to binary, HCF/GCD, Fibonacci series generation using recursion

