package sets;
//sorting inbuilt class objects
//TreeSet class is used for sorting sets
//Cannot use Collection.sort() method for sorting a set

import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		//Set<String> set = new TreeSet<String>(); //default sorting
		Set<String> set = new TreeSet<String>(new SortSetinDescending()); //custom sorting

		  
        // Adding elements into HashSet using add() 
        set.add("India"); 
        set.add("Australia"); 
        set.add("South Africa"); 
        set.add("India");// adding duplicate elements 
  
        // Displaying the HashSet 
        System.out.println(set); 

	}

}
