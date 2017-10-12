package class6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// test();
		playGame();
	}

	private static void test() {
		System.out.println("START");
		int x = 10;
		int y = 0;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x / y);
		System.out.println(x * y);
		System.out.println("DONE");
	}

	static void playGame() {
		System.out.println("Let's play a game of divisions...");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the first number");
			int x = scanner.nextInt();
			System.out.println("Enter the second number");
			int y = scanner.nextInt();
			float d = 0;

			d = divide(x, y);
			System.out.println(x + " / " + y + " = " + d);
			System.out.println("Do you want to play. If Yes, type Yes");
			String answer = scanner.next();
			if (answer.equalsIgnoreCase("yes")) {
				continue;
			} else {
				break;
			}
		}
	}

	static float divide(int a, int b) {
		return a / b;
	}

}
