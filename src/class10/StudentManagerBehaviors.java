package class10;

import java.io.IOException;

public interface StudentManagerBehaviors {

	int getTotalStudents() throws IOException;

	void saveStudent(Student student) throws IOException;

	String getStudentNameForRollNumber(String rollNumber);

	void deleteStudents(String roll) throws IOException;

	void displayStudents() throws IOException;

	String findStudent(String rollNumber) throws IOException;

	void save() throws IOException;
}