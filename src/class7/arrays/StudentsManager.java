package class7.arrays;

public class StudentsManager {
	Student[] students = new Student[3];
	private int location = 0;

	public void addStudent(String name) {
		Student s = new Student(name);
		int max = students.length;
		if (location == max) {
			Student[] newStudents = new Student[max + 1];
			moveOldStudentsIntoNewArray(students, newStudents);
			students = newStudents;
		}
		students[location] = s;
		location++;
	}

	private void moveOldStudentsIntoNewArray(Student[] old, Student[] newStudents) {
		int index = 0;
		for (Student s : old) {
			newStudents[index++] = s;
		}

	}

	public void removeStudent(String name) {
		for (int i = 0; i < students.length; i++) {
			Student x = students[i];
			if (x == null)
				continue;
			if (x.name.equals(name)) {
				students[i] = null;
				return;
			}
		}
	}

	public void replaceStudent(String first, String second) {
		for (int i = 0; i < students.length; i++) {
			Student x = students[i];
			if (x == null)
				continue;
			if (x.name.equals(first)) {
				students[i] = new Student(second);
				return;
			}
		}

	}

	public int getStudentCount() {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				count++;
			}
		}
		return count;
	}

	public void display() {
		for (Student s : students) {

			System.out.print(s + " ");

		}
		System.out.println();
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
		sm.display();

	}
}

class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}
