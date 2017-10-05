package class5;

public class Polymorphism {

	public static void main(String[] args) {
		Person yuxin = new Person();
		Chocolate c = new Chocolate();
		Biscuit b = new Biscuit();
		yuxin.eatChocolate(c);
		yuxin.eatBiscuit(b);

		System.out.println("-------");
		yuxin.eat(b);
		yuxin.eat(c);
		
		yuxin.eat(c, b);

	}

}

class Person {
	void eatChocolate(Chocolate c) {
		System.out.println("Eating Chocolate");

	}

	void eatBiscuit(Biscuit b) {
		System.out.println("Eating Biscuit");
	}

	void eat(Chocolate c) {
		System.out.println("Eat Chocolate");
	}

	void eat(Biscuit b) {
		System.out.println("Eat Biscuit");
	}

	void eat(Chocolate c, Biscuit b) {
		System.out.println("Eating chocoloate and biscuit");
	}
}

class Chocolate {

}

class Biscuit {

}
