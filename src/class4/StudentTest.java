package class4;

public class StudentTest {
	public static void main(String args[]) {
		Student s = new Student();
		s.setRollNumber("100");

		Student balla = new Student("101");
		// balla.setRollNumber("102");

		System.out.println(balla.getRollNumber());

		// balla.setRollNumber("-1");
		// System.out.println(balla.getRollNumber());
		// balla.gpa = 10.9f;
		// System.out.println(balla.gpa);

		balla.setGpa(3.75f);
		// s.setGpa(10.8f);

		balla.setFirst("Balla");
		balla.setFirst("Balla Again");

		System.out.println(balla.isNameStartingWith("Ba"));
		System.out.println(balla.isNameStartingWith("ab"));
		displayWordsWithAbstraction("NEU is located in Seattle and Boston");
	}

	public static void displayWordsWithAbstraction(String sentence) {
		String[] words = sentence.split(" ");
		for (String w : words) {
			System.out.println(w);
		}
	}

	// Siva is talking in the class
	// Siva
	// is
	// talking
	// in
	// the
	// class
	public static void displayWords(String sentence) {
		char[] characters = sentence.toCharArray();
		String word = "";
		for (char c : characters) {
			if (c != ' ') {
				word = word + c;
				continue;
			}
			if (c == ' ') {
				System.out.println(word);
				word = "";
				continue;
			}
		}
		System.out.println(word);
	}
}
