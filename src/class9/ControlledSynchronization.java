package class9;

public class ControlledSynchronization {

	public static void main(String[] args) {
		Person john = new Person("John");
		Thread speak = new SpeakingThread(john);
		Thread eat = new EatingThread(john);
		Thread walk = new Thread(() -> john.walk());
		Thread jog = new Thread(() -> john.jog());
		speak.start();
		eat.start();
		walk.start();
		jog.start();

	}

}
