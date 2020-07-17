package CollectionUtilityPrograms;

public class Student implements Comparable {
	private String name;
	private int age;
	private int marks;
	// String Address;
	static int studentCount;

	public Student(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		studentCount++;
	}

	@Override
	public String toString() {

		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getMarks() {
		return marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	// public void setAddress(String address) {
	// Address = address;
	// }
	// public String getAddress() {
	// return Address;
	// }
	@Override
	public int compareTo(Object o) {
		Student std = (Student) o;
		return this.name.compareTo(std.name);

	}
	// @Override
	// public int hashCode() {
	// final int prime = 31;
	// int result = 1;
	// result = prime * result + age;
	// result = prime * result + marks;
	// result = prime * result + ((name == null) ? 0 : name.hashCode());
	// return result;
	// }
	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// Student other = (Student) obj;
	// if (age != other.age)
	// return false;
	// if (marks != other.marks)
	// return false;
	// if (name == null) {
	// if (other.name != null)
	// return false;
	// } else if (!name.equals(other.name))
	// return false;
	// return true;
	// }

@Override
public boolean equals(Object obj) {
	
	if (this == obj) return true;
	if (obj == null) return false;
	if (this.getClass() != obj.getClass()) return false;
	Student other = (Student) obj; 
	if(this.age != other.age)
		return false;
	else if (this.marks != other.marks)
	    return false;
	else if (this.name == null) {
		if (other.name != null)
		return false; 
	}else if(!this.name.equals(other.name))
				return false;
	
	return true;
}

}
