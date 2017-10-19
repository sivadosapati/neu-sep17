package class7.collections;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class StudentsManager {

	// private ArrayList students = new ArrayList();

	// private LinkedHashSet students = new LinkedHashSet();

	private TreeSet students = new TreeSet();

	public Collection getStudents() {
		return students;
	}

	public void addStudentInList(String name) {
		int index = 0;
		int matchingIndex = index;
		for (Object n : students) {
			String student = (String) n;
			if (student.equals(name)) {
				return;
			}
			if (name.compareTo(student) < 0) {
				matchingIndex = index;
				break;
			}
			index++;
		}
		if (students instanceof List) {
			List list = (List) students;
			list.add(matchingIndex, name);
		}

		// students.add(name);
	}

	public void addStudent(String name) {
		students.add(name);
		// addStudentInList(name);
	}

	public void removeStudent(String name) {
		students.remove(name);
	}

	public void replaceStudent(String first, String second) {
		students.remove(first);
		students.add(second);
	}

	public int getStudentCount() {
		return students.size();
	}

	public void display() {
		System.out.println(students);
	}

	public static void main(String args[]) {
		StudentsManager sm = new StudentsManager();
		sm.display();
		sm.addStudent("John");
		sm.addStudent("Max");
		sm.addStudent("Mary");
		sm.display();
		sm.removeStudent("John");
		sm.display();
		System.out.println(sm.getStudentCount());
		sm.replaceStudent("Mary", "Tony");
		sm.display();
		System.out.println(sm.getStudentCount());
		sm.addStudent("Ann");
		sm.display();
		sm.addStudent("Manjula");
		sm.display();
		sm.removeStudent("Ann");
		sm.removeStudent("Tony");
		sm.addStudent("Greg");
		sm.addStudent("Greg");

		sm.display();
		sm.addStudent("Callie");
		Collection c = sm.getStudents();
		Student s = new Student("Siva");
		c.add(s);
		sm.display();
		// sm.removeStudent("Siva");
		sm.display();

	}
}

class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	public String toString() {
		return "Name -> " + name;
	}
}
