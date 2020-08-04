package sets;

import java.util.Arrays;
import java.util.HashSet;

public class UnionandIntersection {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5, 7, 9 };
		int arr2[] = { 2, 4, 6, 8, 9, 10 };

		System.out.println("Finding Union and Intersection from 2 sets: "+Arrays.toString( arr1)+" & " +Arrays.toString( arr2));
		union(arr1, arr2);
		intersection(arr1, arr2);
	}

	public static void union(int arr1[], int arr2[]) {
		HashSet<Integer> union = new HashSet<>();

		for (int i = 0; i < arr1.length; i++)
			union.add(arr1[i]);
		for (int i = 0; i < arr2.length; i++)
			union.add(arr2[i]);
		System.out.println("\nUnion of two sets are: "+union);
	}

	public static void intersection(int arr1[], int arr2[]) {

		HashSet<Integer> intersection = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					intersection.add(arr1[i]);

				}
			}

		}
		System.out.println("\nIntersection of two sets are: "+intersection);
	}

}
