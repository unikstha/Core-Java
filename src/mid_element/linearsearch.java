package mid_element;

public class linearsearch {

	// Create array of 6 integer element and search in number by linear search,
	// calculate average of all the numbers
	// and make find maximum (Largest) number

	public static void main(String args[]) {
		System.out.println("***Creating an array of 6 elements and linear searching***");

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int value = 2;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != value) {
				System.out.println("no element found");}
				else {
				System.out.println(arr[i]);
				break;}}
//				

		System.out.println("\n***Calculating average of all the numbers***");
		int sum = 0;
		for (int num : arr)
			sum = sum + num;
		int average = 0;
		average = sum / arr.length;
		System.out.println("Average of array elements is: " + average);

		System.out.println("\n***Finding Largest Number***");
		int max = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		System.out.println("Largest number is: " + max);

	}

}
