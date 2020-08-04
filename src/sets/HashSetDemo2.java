package sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {
	public static void main (String[]args) {
		
		Dog d1 = new Dog("Tommy", 8);
		Dog d2 = new Dog("Jacky", 7);
		Dog d3 = new Dog("Manky", 12);
		Dog d4 = new Dog("Tommy", 8);


		Set<Dog> set = new HashSet<Dog>(); // purple is class

		set.add(d1);
		set.add(d2);
		set.add(d3);
		set.add(d4);
		
		System.out.println(set);
		
		
	}

}
