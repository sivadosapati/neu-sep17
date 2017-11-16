package class10;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toFile() {
		return name + "~" + rollNumber;
	}

	public static Student makeStudentFromLine(String line) {
		String[] tokens = line.split("\\~");
		return new Student(tokens[0], tokens[1]);
	}

	public String toString() {
		return toFile();
	}

	private String name;

	public Student(String name, String roll) {
		this.name = name;
		this.rollNumber = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	private String rollNumber;
}