package class9;

class Student extends Person {

	private static Object ANSWER_LOCK = new Object();

	public Student(String name) {
		super(name);
	}

	public void answerQuestion(String question) {
		synchronized (ANSWER_LOCK) {
			perform("Answer Question -> " + question);
		}
	}

}