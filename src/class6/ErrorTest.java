package class6;

public class ErrorTest {
	public static void main(String args[]) {
		System.out.println("START");
		Bag b = new Bag();
		System.out.println("DONE");
	}
}

class Bag {
	Bag b = new Bag();
}
