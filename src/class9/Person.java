package class9;

class Person {
	String name;
	private Object EAT_SPEAK_LOCK = new Object();
	private Object WALK_RUN_LOCK = new Object();

	public Person(String name) {
		this.name = name;
	}

	public void listen() {
		perform("Listening");
	}

	public void eat() {
		synchronized (EAT_SPEAK_LOCK) {
			perform("Eating");
		}
	}

	public void think() {
		perform("Thinking");
	}

	public void speak() {
		synchronized (EAT_SPEAK_LOCK) {
			perform("Speaking");
		}
	}

	public void jog() {
		synchronized (WALK_RUN_LOCK) {
			perform("Jogging");
		}
	}

	public void walk() {
		synchronized (WALK_RUN_LOCK) {
			perform("Walking");
		}
	}

	protected void perform(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "." + this.name + " -> " + name + " -> " + getTime());
			int x = getRandom(10);
			if (x == 9) {
				// throw new RuntimeException("Problem");
			}
			sleep(1000);
		}
	}

	int getRandom(int x) {
		return (int) (Math.random() * x);
	}

	public void sleep(int x) {
		try {
			Thread.sleep(x);
		} catch (Exception e) {
		}
	}

	public String getTime() {
		return new java.sql.Time(System.currentTimeMillis()) + "";
	}

}
