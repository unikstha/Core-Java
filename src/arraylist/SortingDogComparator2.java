package arraylist;

import java.util.Comparator;

import sets.Dog;

public class SortingDogComparator2 implements Comparator<Dog> {

	@Override
	public int compare(Dog d1, Dog d2) {

		return d2.name.compareTo(d1.name); // descending order of age
	}

}
