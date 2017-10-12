package class6;

public class PassTest {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		changeNumber(10);
		System.out.println(x);
		System.out.println("------");
		final Number n = new Number(10);
		System.out.println(n);
		changeNumber(n);
		System.out.println(n);

	}

	public static void changeNumber(int x) {
		x = x + 10;
	}

	public static void changeNumber(final Number n) {
		n.x = n.x + 10;
		// n = null;
	}

}

class Number {
	int x;

	public Number(int x) {
		this.x = x;
	}

	public String toString() {
		return x + "";
	}
}
