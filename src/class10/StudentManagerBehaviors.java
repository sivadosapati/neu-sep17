package class10;

import java.util.Collection;

public interface StudentManagerBehaviors {

	public Collection<Student> getStudents();

	int getTotalStudents();

	void saveStudent(Student student);

	String getStudentNameForRollNumber(String rollNumber);

	void deleteStudents(String roll);

	void displayStudents();

	String findStudent(String rollNumber);

	void save();

}