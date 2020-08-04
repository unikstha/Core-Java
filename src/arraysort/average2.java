package arraysort;

public class average2 {
	public static void main(String[] args) {
//		"double", can handle more memory, allow user to use decimal value, than "integer";
//		data type (int, double, float); loop; array
		int[] values = { 1, 2, 3, 4, 20 };
		int total = 0;
		for (int element : values) {
			total += element;
		}

		int average = 0;
		if (values.length > 0) {
			average = total / values.length;
		}
		System.out.println(average);

	}

}
