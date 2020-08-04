package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//set does not allow duplicate
//this program is for inbuilt class object(String) NOT custom class

public class HashDemo1 {
	
	public static void main (String[] args) {
		
//		 HashSet<String> h = new HashSet<String>(); 
		 Set<String> set = new HashSet<String>(); 

		  
	        // Adding elements into HashSet using add() 
	        set.add("India"); 
	        set.add("Australia"); 
	        set.add("South Africa"); 
	        set.add("India");// adding duplicate elements 
	  
	        // Displaying the HashSet 
	        System.out.println(set); 
	        
	        //iterate the same way we used ArrayList
	        
	        System.out.println("\n***** Using for loop *****"); 

	        
	       for (Iterator iterator = set.iterator(); iterator.hasNext();) { //search 
			String string = (String) iterator.next();//store
			System.out.println(string);//display
			
		}
	    } 
		
	}
