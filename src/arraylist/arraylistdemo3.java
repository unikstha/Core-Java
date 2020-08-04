//create ArrayList of Dog class objects...there are two attributes in Dog class-name,age
//iterate ,sort,search
package arraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class arraylistdemo3{	
	
	public static void main(String[]args) {
	
	List<String> alist=new ArrayList<String>();
	
	
	alist.add("Prabhat");
	alist.add("Anuskha");
	alist.add("Akash");
	alist.add("Sagun");
	alist.add("Unique");
	
	
	Collections.sort(alist);// default is ascending order
	
	for (String s : alist) {
		System.out.println(s);}
	
	System.out.println("######################");
	System.out.println("#####Sorting in descending using compareTo method#####");

	Collections.sort(alist, new SortInDescending());
	
	for(String s : alist) {
		System.out.println(s);
	}
    String s1=new String("xyz"); //searching xyz in list
    
    System.out.println(alist.contains(s1));}

}

class SortInDescending implements Comparator<String>{ //Comparator provides custom sorting behaviour
	
	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
}
