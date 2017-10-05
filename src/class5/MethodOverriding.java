package class5;

public class MethodOverriding {

	public static void main(String[] args) {
		Human h = new Human();
		Professor siva = new Professor();
		h.speak();
		siva.speak();

		Human hh = new Professor();
		hh.speak();
		hh = new Student();
		hh.speak();

		Human a = new Student();
		a.speak();

		Student s;
		// s = new Human();
		// s = new Professor();

		System.out.println("---------");
		Auditorium aud = new Auditorium();
		aud.letSomeoneSpeak(new Human());
		aud.letSomeoneSpeak(siva);
		aud.letSomeoneSpeak(new Student());
		aud.letSomeoneSpeak(new Guest());
	}

}

class Auditorium {

	// No overloading of methods

	void letHumanSpeak(Human h) {
	}

	void letProfessorSpeak(Professor p) {
	}

	void letGuestSpeak(Guest g) {
	}

	void letStudentSpeak(Student s) {
	}

	// overloading of methods
	void letPersonSpeak(Human h) {
		h.speak();
	}

	void letPersonSpeak(Professor p) {
		p.speak();
	}

	void letPersonSpeak(Guest g) {
		g.speak();
	}

	void letPersonSpeak(Student s) {
		s.speak();
	}

	// invoke overriding

	void letSomeoneSpeak(Human h) {
		h.speak();
	}

}

class Human {
	void speak() {
		System.out.println("Human is speaking");
	}
}

class Guest extends Human {
	void speak() {
		System.out.println("Guest is speaking");
	}
}

class Student extends Human {

}

class Professor extends Human {
	@Override
	void speak() {
		System.out.println("Professor is speaking");
	}
}