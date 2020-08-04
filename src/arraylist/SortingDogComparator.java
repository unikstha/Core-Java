package arraylist;

import java.util.Comparator;

import sets.Dog;

public class SortingDogComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog d1, Dog d2) {

		return d1.age - d2.age; // ascending order of age
	}

}
