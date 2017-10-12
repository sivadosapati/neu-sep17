package class6;

public class WrapperTest {

	public static void main(String[] args) {
		int number = 10;
		System.out.println(number);
		Integer ix = new Integer(0);
		System.out.println(ix);

		int a = number;
		Integer ab = a;
		ab = new Integer(56);
		a = ab;
		System.out.println(a);
	}

}
