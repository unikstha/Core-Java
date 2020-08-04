
package arraysort;

import java.util.Arrays;

public class Arraysort{
	
	public  void ascendSort(int[] arr) {
		
		int temp;
		 for(int j=0;j<arr.length;j++) {
	            for(int k =j+1;k<arr.length;k++) {
	            	if(arr[j]<arr[k]) {
	            		temp = arr[j];
	            		arr[j]=arr[k];
	            		arr[k]=temp;
	            	}
	            }
	            }
		
	}
	

	public static void main(String[] arg) {
		//firstrepeatingnumber repeat = new firstrepeatingnumber();
		int arre[] = { 10, 5, 3, 4, 7, 5, 6 };
//		int arr_size = arr.length;
//		repeat.repeating(arr, arr_size);
		Arraysort ob1 = new Arraysort();
		
		ob1.ascendSort(arre);
		System.out.println(Arrays.toString(arre));
	}
}