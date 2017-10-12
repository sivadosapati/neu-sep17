package class6;

import java.util.Scanner;

public class RunnerTest {

	public static void main(String[] args) {
		playGame();

	}

	private static void playGame() {
		System.out.println("START");
		try {
			System.out.println("Enter a class name that implements Runner interface");
			String x = new Scanner(System.in).nextLine();
			Class cls = Class.forName(x);
			Object object = cls.newInstance();
			Runner r = (Runner) object;
			r.execute();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception -> " + e.getMessage());
		}

		System.out.println("END");
	}

}
