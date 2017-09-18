package class1;

public class TestMe {

	public static void main(String[] args) {

		byte b;// 1 Byte
		short age;// 2 Bytes
		int populationOnEarth;// 4 Bytes
		long distanceToSunFromEarth;// 8 Bytes

		double salary;// 8
		float grade;// 4

		char initial;// 1 Byte

		boolean rainingToday;// 1 Byte

		int sivaAge = 30;
		int kumarAge = 40;
		int totalAge = sivaAge + kumarAge;
		System.out.println(totalAge);

		rainingToday = true;
		System.out.println(rainingToday);

		grade = 3.56f;
		salary = 76000.50;

		initial = 'A';
		char comma = ',';
		rainingToday = false;
		if (rainingToday == true) {
			System.out.println("Get an Umbrella");
		} else {
			System.out.println("Keep walking");
		}
		// Expresssions == < > >= <=

		Student peter = new Student();
		peter.gpa = 3.54f;

		Student bin = new Student();
		bin.gpa = 3.90f;

		System.out.println("Peter's Grade -> " + peter.getGrade());
		System.out.println("Bin's Grade -> " + bin.getGrade());

		Student yuna = new Student();
		Student wenhui = new Student();
		Student bharti = new Student();
		yuna.name = "Yuna";
		yuna.pen = false;
		wenhui.name = "Wenhui";
		wenhui.feelingWell = false;
		wenhui.pen = true;
		bharti.name = "Bharti";
		bharti.pen = true;

		Book book = new Book();
		/*
		 * book.display(); if (yuna.feelingWell) yuna.write(book);
		 * book.display(); if (wenhui.feelingWell) wenhui.write(book);
		 * book.display(); if (bharti.feelingWell) bharti.write(book);
		 * book.display();
		 * 
		 * book.eraseNames();
		 */

		System.out.println("----------------------");

		Student students[] = new Student[60];
		students[0] = yuna;
		students[1] = wenhui;
		students[2] = bharti;
		System.out.println("Before Loop");
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			if (student == null) {
				continue;
			}
			if (student.feelingWell == false) {
				continue;
			}
			student.write(book);
			book.display();
		}
		System.out.println("After Loop");

	}

}

class Book {
	String names = "";

	void addName(String name) {
		names = names + name + "\n";
	}

	public void eraseNames() {
		names = "";

	}

	void display() {
		System.out.println("Names -> " + names);
	}
}

class Student {
	float gpa;
	String name;
	boolean pen;
	boolean feelingWell = true;

	void write(Book bigBookNotUsable) {
		if (pen == true) {
			bigBookNotUsable.addName(name);
		}
	}

	char getGrade() {
		if (gpa >= 3.75f) {
			return 'A';
		}
		if (gpa > 3.5f && gpa < 3.75f) {
			return 'B';
		}
		if (gpa > 3.25f) {
			return 'C';
		}
		return 'D';
	}
}