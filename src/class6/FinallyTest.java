package class6;

public class FinallyTest {

	public static void main(String[] args) {
		test();

	}

	static int getRandomNumber() {
		return (int) (Math.random() * 10);
	}

	private static void test() {
		try {
			if (getRandomNumber() > 5) {
				System.out.println("Try");
			} else {
				throw new Exception();
			}
			return;
		} catch (Exception e) {
			System.out.println("Exception ");
		} finally {
			System.out.println("Finally");
		}
	}

}
