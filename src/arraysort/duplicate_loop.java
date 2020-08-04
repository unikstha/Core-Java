package arraysort;

public class duplicate_loop {
	void repeating(int arr[]) {
		
		int i, j;
		
		System.out.println("Repeating elements are: ");
		
		for (i=0; i<arr.length; i++) {
			for (j=i+1; j<arr.length; j++)
			
			if (arr[i] == arr[j])
System.out.println(arr[i]+"");
		
		}
		
	}


public static void main(String[]arg) {
	duplicate_loop repeat= new duplicate_loop();
	int arr[]= {10,5,3,4,7,5,6,6};
	
	repeat.repeating(arr);
}
}