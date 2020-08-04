package arraysort;

public class binarysearch {

//	Find last index of an element in a sorted array with duplicates.
//	Given a sorted array of integers containing duplicates, write a program which returns the last index of an element.
//	Example:
//	Input:
//	array = {0, 1, 2, 2, 4, 5, 5, 5, 8};
//	num = 5;
//	Output: 
//	Element 5 found at index 7

	public static void main(String[] args) {
		int numbers[] = { 0, 1, 2, 2, 4, 5, 5, 5, 8 };
		int n = numbers.length;
		int num = 5;
		System.out.println("Element " + num + " found at " + search(numbers, n, 8));

	}

	static int search(int numbers[], int n, int num) {
		int i = 0;
		while (i < n) {
			if (numbers[i] == num)
				return i;
			i = i + Math.abs(numbers[i] - num);
		}

		System.out.println("number is not" + " present!");

		return -1;
	}
}
