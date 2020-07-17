package CollectionUtilityPrograms;

import java.util.Comparator;

public class StudentMarkComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
	//return ((Student) o1).getMarks() - ((Student) o1).getMarks();
	return o1.getMarks() - o2.getMarks();
	}

}
