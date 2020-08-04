package arraylist;

//Sorting custom class
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sets.Dog;
//Comparable vs. Comparator
//Comparable provides default sorting behavior
//Comparator provides custom sorting behavior
//When writing custom class(Dog), must override equal() method
//equal() method belongs to object class and it compares references, so override it to compare by content
public class arraylistdemo4 {

	public static void main(String[] args) {
		Dog d1 = new Dog("Kaeki",0);
		Dog d2 = new Dog("Jacky", 7);
		Dog d3 = new Dog("Manky", 12);

		List<Dog> list = new ArrayList<Dog>(); // purple is class

		list.add(d1);
		list.add(d2);
		list.add(d3);

		System.out.println("\n****Sorting age in ascending order ****");

		Collections.sort(list, new SortingDogComparator());// using custom comparator
		System.out.println(list);
		
		System.out.println("\n****Sorting name in descending order****");
		Collections.sort(list, new SortingDogComparator2());// using custom comparator
		System.out.println(list);
		
		System.out.println("\n****Sorting name in ascending order****");
		
		Collections.sort(list); // default sorting by implementing comparable interface
		System.out.println(list);
		
		
		
		
		//Search
		Dog d = new Dog("Tommy", 8);
		
		System.out.println(list.contains(d));//internally calls equal method

	}

}
