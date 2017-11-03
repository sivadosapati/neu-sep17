package class9;

public class ThreadTest {
	public static void main(String args[]) {
		// sequential();
		// parallel();
		classRoom();
	}

	private static void classRoom() {
		Professor p = new Professor("Cva");
		Student ann = new Student("Ann");
		// sequentialClaassRoom(p, ann);
		parallelClassRoom(p, ann);

	}

	private static void sequentialClaassRoom(Professor p, Student ann) {
		p.teach();
		ann.listen();
		Student manjula = new Student("Manjula");
		manjula.listen();

	}

	private static void parallelClassRoom(Professor p, Student ann) {
		TeachingThread tt = new TeachingThread(p);
		ListeningStudent ls = new ListeningStudent(ann);
		tt.start();
		// tt.run();
		Thread lt = new Thread(ls);
		lt.start();
		// lt.run();

		ListeningStudent ls1 = new ListeningStudent(new Student("Manjula"));
		new Thread(ls1).start();
		// ls1.run();
		tt.start();
	}

	static class TeachingThread extends Thread {
		Professor p;

		TeachingThread(Professor p) {
			this.p = p;
		}

		public void run() {
			p.teach();
		}
	}

	static class ListeningStudent implements Runnable {
		Student s;

		ListeningStudent(Student s) {
			this.s = s;
		}

		@Override
		public void run() {
			s.listen();

		}

	}

	private static void parallel() {
		Student manjula = new Student("Manjula");
		Thread speak = new Thread() {
			public void run() {
				manjula.speak();
			}
		};

		Thread think = new Thread() {
			public void run() {
				manjula.think();
			}
		};
		speak.start();
		think.start();

	}

	private static void sequential() {
		Student manjula = new Student("Manjula");
		manjula.think();
		manjula.speak();
	}
}





