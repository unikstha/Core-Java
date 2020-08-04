package sets;

public class Dog implements Comparable <Dog>{
	public String name;
	public int age;
//	right click to source; generate superclass, field, string for "Comparing"
	// generate hash code and equal for "Searching"
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Dog(String name) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Dog d) {
		// TODO Auto-generated method stub
		return this.name.compareTo(d.name); //comparing by name; no - to name
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
