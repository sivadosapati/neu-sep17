package class10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentManagerAlternateImplementation implements StudentManagerBehaviors {

	private Map<String, Student> students = new LinkedHashMap<String, Student>();
	private String fileName;

	protected Map<String, Student> getStudents() {
		return students;
	}

	public String getFileName() {
		return fileName;
	}

	public StudentManagerAlternateImplementation(String file) {
		this.fileName = file;
		try {
			students = makeStudentsMap(file);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void save() throws IOException {
		PrintWriter writer = new PrintWriter(new FileWriter(new File(fileName)));
		for (Student s : students.values()) {
			writer.println(s.toFile());
		}
		writer.close();
	}

	protected Map<String, Student> makeStudentsMap(String file) throws IOException {
		File f = new File(file);
		BufferedReader reader = new BufferedReader(new FileReader(f));
		Map<String, Student> students = new LinkedHashMap<String, Student>();
		while (true) {
			String line = reader.readLine();
			if (line == null)
				break;
			String[] data = line.split("\\~");
			Student s = new Student(data[0], data[1]);
			students.put(s.getRollNumber(), s);
		}
		reader.close();
		return students;
	}

	@Override
	public int getTotalStudents() throws IOException {
		return students.size();
	}

	@Override
	public void saveStudent(Student student) throws IOException {
		students.put(student.getRollNumber(), student);

	}

	@Override
	public String getStudentNameForRollNumber(String rollNumber) {
		Student s = students.get(rollNumber);
		if (s == null)
			return null;
		return s.getName();
	}

	@Override
	public void deleteStudents(String roll) throws IOException {
		students.remove(roll);
	}

	@Override
	public void displayStudents() throws IOException {
		System.out.println(students.values());
	}

	@Override
	public String findStudent(String rollNumber) throws IOException {
		return getStudentNameForRollNumber(rollNumber);
	}

}
