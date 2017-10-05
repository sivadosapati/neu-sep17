package class5.interfaces;

public class Society {

	public static void main(String[] args) {
		Allrounder a = new Allrounder();
		Mother m = new Mother();
		Father f = new Father();
		Kid k = new Kid();

		k.play(m);
		k.play(a);
		k.play(f);

		Parent p;
		p = new Mother();
		k.play(p);
		p = new Father();
		k.play(p);
	}

}

class Kid {
	void play(Parent p) {
		p.playWithKid();
	}
}

class Student {
	void learn(Professor p) {
		p.teach();
	}

	void learn(Allrounder a) {

	}
}

interface Professor {
	void teach();
}

class OnlineCourse implements Professor {

	@Override
	public void teach() {
		// TODO Auto-generated method stub

	}

}

interface Parent {
	void playWithKid();
}

interface Employee {
	void work();
}

class Mother implements Parent {

	// @Override
	public void playWithKid() {
		System.out.println("Mother is playing with kid");

	}

}

class Father implements Parent {

	// @Override
	public void playWithKid() {
		System.out.println("Father is playng with kid");

	}

}

class Allrounder implements Professor, Parent, Employee {

	@Override
	public void work() {
		System.out.println("Work");

	}

	@Override
	public void playWithKid() {
		System.out.println("Allrounder is playing with kid");

	}

	@Override
	public void teach() {
		System.out.println("Teach");

	}

}