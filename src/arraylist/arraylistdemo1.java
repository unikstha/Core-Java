package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylistdemo1 {

	public static void main(String[] args) {
		
//		ArrayList alist=new ArrayList();
		List alist=new ArrayList();
		
		alist.add("Prabhat"); //String
		alist.add("Anuskha");
		alist.add("Shakar");
		alist.add("Unique");
		alist.add(100);//Integer
		
		System.out.println(alist);
		
		for (int i=0; i<alist.size();i++) {
			System.out.println(alist.get(i));//classical loop
		}
		
		for (Object s:alist) {
			System.out.println(s); //for-each loop
			
		}
		Iterator it=alist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//iterator
		}

	}

}
