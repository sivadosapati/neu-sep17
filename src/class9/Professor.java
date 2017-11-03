package class9;

public class Professor extends Person {

	public Professor(String name) {
		super(name);
	}

	public void teach() {
		perform("Teaching");
	}
}