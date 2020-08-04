package mid_element;

//1) Calculate mid element of array A[m] where m is index of middle element
//mid=(start+end)/2
//2)Compare the element s with a[m] if s==a[m] break;
//else if s<a[m]
//end=m-1;
//else
//start=m+1;

//1.Implement binary search
//given array {4,7,9,18,30,39,40,41,45,47,78,89}
//element to be searched-78
//if its found then print "found"otherwise print "not found"

//*******************************
//sorting uses nlogn better than n^2 
//arrays.sort=nlogn

public class midelement {

	public static void main(String[] args) {
		int[] a = { 4, 7, 9, 18, 30, 39, 40, 41, 45, 47, 78, 89 };
		int s = 78;
//		System.out.println("Unique");
		int result = findbybinary(a, s);
		if (result == -1) {
			System.out.println("Number not found");}
			else { System.out.println("Number found");


		}
	}

	private static int findbybinary(int[] a, int s) {
		int min = 0;
		int max = a.length - 1; // index starts with 0
		

		while (min <= max) {
			int mid = (min + max) / 2;//middle element should be inside loop

			if (s == a[mid]) {
//				System.out.println("Number found");

				return mid;
			} else if (s < a[mid]) {

				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		return -1;

	}
}
