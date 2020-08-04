package arraysort;

public class decimaltobinary1 {
//	Divide no. by 2 and store the remainder in array
//	Divide number by 2 through/division operator
//	Repeat the step 2 until number is greater than 0

	public static void decimaltobinary(int num) {
//	num=4;
//	a=num%2;
//	b=num/2;
//	

		int binary[] = new int[40];
		int index = 0;
		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
	}

}
