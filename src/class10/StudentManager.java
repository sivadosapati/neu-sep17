package class10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class StudentManager implements StudentManagerBehaviors {
	public static String FILE = "students.txt";
	public static String OBJECT_FILE = "students.dat";

	public static void main(String[] args) throws IOException {

		// StudentManagerBehaviors sm = new StudentManager();
		StudentManagerBehaviors sm = new StudentManagerAlternateImplementation(FILE);
		Scanner scanner = new Scanner(System.in);
		studentOperations(scanner, sm);

	}

	public static void studentOperations(Scanner scanner, StudentManagerBehaviors sm) throws IOException {
		while (true) {
			System.out.println("Enter your command (count|add|delete|display|find|end)");
			String x = scanner.nextLine();
			if (x.equals("count")) {
				System.out.println(sm.getTotalStudents());
				continue;
			}
			if (x.equals("end")) {
				System.out.println("Thank you for spending time with me. I'm done..");
				sm.save();
				break;
			}
			if (x.equals("add")) {
				System.out.println("Enter Student's name : ");
				String name = scanner.nextLine();
				System.out.println("Enter Student's roll : ");
				String roll = scanner.nextLine();
				Student s = new Student(name, roll);
				sm.saveStudent(s);
				continue;
			}
			if (x.equals("delete")) {
				System.out.println("Enter Student's roll: ");
				String roll = scanner.nextLine();
				sm.deleteStudents(roll);
				continue;
			}
			if (x.equals("display")) {
				sm.displayStudents();
				continue;
			}
			if (x.equals("find")) {
				System.out.println("Enter Student's roll : ");
				String roll = scanner.nextLine();
				String name = sm.findStudent(roll);
				System.out.println(name);
				continue;
			}

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see class10.StudentManagerBehaviors#getTotalStudents()
	 */
	@Override
	public int getTotalStudents() {
		try {
			File file = new File(FILE);
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			int count = 0;
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				count++;
			}
			br.close();
			reader.close();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see class10.StudentManagerBehaviors#saveStudent(class10.Student)
	 */
	@Override
	public void saveStudent(Student student) {
		try {
			String data = student.toFile();
			File f = new File(FILE);
			FileWriter writer = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(writer);
			pw.print("\n" + data);
			pw.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * class10.StudentManagerBehaviors#getStudentNameForRollNumber(java.lang.
	 * String)
	 */
	@Override
	public String getStudentNameForRollNumber(String rollNumber) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see class10.StudentManagerBehaviors#deleteStudents(java.lang.String)
	 */
	@Override
	public void deleteStudents(String roll) {
		try {
			File f = new File(FILE);
			StringBuilder res = new StringBuilder();
			FileReader reader = new FileReader(f);
			BufferedReader br = new BufferedReader(reader);
			int count = 0;
			boolean addNewLine = false;
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.contains(roll)) {
					System.out.println(line);
					continue;
				}
				if (addNewLine == true) {
					res.append("\n");
				} else {
					addNewLine = true;
				}
				res.append(line);
			}
			br.close();
			reader.close();
			FileWriter writer = new FileWriter(f);
			PrintWriter pw = new PrintWriter(writer);
			pw.println(res.toString());
			pw.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see class10.StudentManagerBehaviors#displayStudents()
	 */
	@Override
	public void displayStudents() {
		try {
			File f = new File(FILE);
			StringBuilder res = new StringBuilder();
			FileReader reader = new FileReader(f);
			BufferedReader br = new BufferedReader(reader);
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				System.out.println(line);
			}
			br.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Collection<Student> getStudents() {
		try {
			Collection<Student> students = new ArrayList<Student>();
			File f = new File(FILE);
			FileReader reader = new FileReader(f);
			BufferedReader br = new BufferedReader(reader);
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				students.add(Student.makeStudentFromLine(line));
			}
			br.close();
			reader.close();
			return students;
		} catch (Exception e) {
			return new ArrayList<Student>();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see class10.StudentManagerBehaviors#findStudent(java.lang.String)
	 */
	@Override
	public String findStudent(String rollNumber) {
		try {
			File f = new File(FILE);
			FileReader reader = new FileReader(f);
			BufferedReader br = new BufferedReader(reader);
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (line.contains(rollNumber)) {
					return line.split("\\~")[0];
				}
			}
			br.close();
			reader.close();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

}
