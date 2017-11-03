package class9;

public class PersonThread extends Thread {
	Person p;

	PersonThread(Person p) {
		this.p = p;
	}

	public Person getPerson() {
		return p;
	}

}

class EatingThread extends PersonThread {
	public EatingThread(Person p) {
		super(p);
	}

	public void run() {
		p.eat();
	}
}

class ThinkingThread extends PersonThread {
	public ThinkingThread(Person p) {
		super(p);
	}

	public void run() {
		p.think();
	}
}

class SpeakingThread extends PersonThread {
	public SpeakingThread(Person p) {
		super(p);
	}

	public void run() {

		p.speak();
	}
}
