package class10;

import java.io.IOException;
import java.util.Scanner;

public class StudentManagerWithObjectPersistenceTest extends StudentManager {
	public static String OBJECT_FILE = "students.dat";

	public static void main(String[] args) throws IOException {

		StudentManagerBehaviors sm = new StudentManager();
		// StudentManagerBehaviors sm = new
		// StudentManagerAlternateImplementation(FILE);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the type of StudentManager (general|map|object)");
			String x = scanner.nextLine();
			if (x.equals("general")) {
				sm = new StudentManager();
				break;
			}
			if (x.equals("map")) {
				sm = new StudentManagerAlternateImplementation(FILE);
				break;
			}
			if (x.equals("object")) {
				sm = new StudentManagerWithObjectPersistence(OBJECT_FILE);
				break;
			}
		}
		studentOperations(scanner, sm);
	}
}
