package CollectionUtilityPrograms;

//import java.util.ArrayList;
import java.util.*;

public class StudentImpl {

	public static void main(String[] args) {
		Student std = new Student("Shiven", 34, 76);
		Student std1 = new Student("Ram", 12, 52);
		Student std2 = new Student("Dinesh", 24, 65);
		Student std3 = new Student("Aryan", 55, 88);
		Student std4 = new Student("Bhim", 28, 96);
		Student std5 = new Student("Krishna", 31, 256);
		Student std6 = new Student("Niranjan", 52, 46);
		System.out.println("Number of student is " + Student.studentCount);

		List<Student> stdList = new ArrayList<Student>();
		stdList.add(std);
		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std3);
		stdList.add(std4);
		stdList.add(std5);
		stdList.add(std6);
		System.out.println("Number of student in List  " + stdList.size());

		Student findStudentObj = new Student("Krishna", 31, 256);
		
		int findInex = stdList.indexOf(findStudentObj);
		System.out.println("Index of Student object is->"+findInex);
		
		// natural sort by using Comparable interface - 
		Collections.sort(stdList);
		for (Student student : stdList) {
			System.out.println(student);
		}
        // sorting using Object of Comparator interface implementation 
		Collections.sort(stdList, new StudentMarkComparator());
		System.out.println("assending order sort by marks *************");
		for (Student student : stdList) {
			System.out.println(student);
		}
		// sort using lambda
		Collections.sort(stdList, (o1,o2)->  ((Student) o2).getMarks() - ((Student) o1).getMarks());
		System.out.println("descendting order sorting by marks *************");
		for (Student student : stdList) {
			System.out.println(student);
		}
	}

}
