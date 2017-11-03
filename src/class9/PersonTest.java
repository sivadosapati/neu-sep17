package class9;

public class PersonTest {

	public static void main(String[] args) {
		Person john = new Person("John");
		Thread think = new ThinkingThread(john);
		Thread speak = new SpeakingThread(john);
		Thread eat = new EatingThread(john);
		Thread j = new Thread(() -> john.jog());
		j.start();
		Thread w = new Thread(()-> john.walk());
		w.start();

		think.start();
		speak.start();
		eat.start();
		Person joe = new Person("Joe");
		Thread jt = new ThinkingThread(joe);
		// jt.start();
		Thread js = new SpeakingThread(joe);
		// js.start();

	}

}
