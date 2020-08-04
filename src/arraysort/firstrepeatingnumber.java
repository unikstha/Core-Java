//
//Find the first repeating element(first duplicate) in an array of integers
//Input:  arr[] = {10, 5, 3, 4, 3, 5, 6}
//Output: 5 [5 is the first element that repeats]
//Input:  arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
//Output: 6 [6 is the first element that repeats]



package arraysort;


public class firstrepeatingnumber {
	public static void main(String[] args) {
		// first duplicate number
		int first = 0;
		// int[] a = new int[]{6, 10, 5, 4, 9, 120, 4, 6, 10};
		int[] a = new int[] { 10, 10, 5, 3, 4, 3, 5, 6 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
					first = first + 1;
					break;
				}
				if (first > 0) {
					break;
				}
			}
		}
	}
}
