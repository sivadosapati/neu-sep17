package class9;

public class ClassRoom {

	public static void main(String[] args) {
		Student ann = new Student("Ann");
		Student bokin = new Student("Bokin");
		// listen(ann).start();
		// listen(bokin).start();
		String question = "How is the Weather";
		answer(ann, question).start();
		answer(bokin, question).start();

	}

	private static Thread listen(Student s) {
		return new Thread(() -> s.listen());
	}

	private static Thread answer(Student s, String question) {
		return new Thread(() -> s.answerQuestion(question));
	}

}
