package class3;
import java.lang.System;

public class ClassRoom {
	public static void main(String args[]) {
		Professor siva = new Professor();
		takeMoney("yuna", siva, 5);
		takeMoney("Bokin", siva, 10);
		takeMoney("Ann", siva, 20);
		System.out.println("----------------");
		takeMoneyFromProtectedWallet("JingYi", siva, 5);
		takeMoneyFromProtectedWallet("WenHui", siva, 10);
		takeMoneyFromProtectedWallet("Cara", siva, 25);
		//AppleStore as = new AppleStore();
		//as.x = 10;

	}

	private static void takeMoneyFromProtectedWallet(String student, Professor p, int m) {
		p.giveMoney(student, m);
	}

	private static void takeMoney(String student, Professor p, int m) {
		System.out.println(student + " is taking " + m + " from wallet -> " + p.wallet);
		if (student.startsWith("B")) {
			p.wallet = p.wallet - m - 10;
		} else {
			p.wallet = p.wallet - m;

		}
		System.out.println(student + " has taken " + m + " from wallet -> " + p.wallet);

	}
}

class Professor {
	int wallet = 100;

	private int protectedWallet = 100;

	public int getProtectedWallet() {
		return protectedWallet;
	}

	int giveMoney(String student, int money) {
		if (money > 10) {
			System.out.println("I'm allowed to give you only 10 dollars (max) and you are asking " + money);
			money = 10;
		}

		if (money > protectedWallet) {
			throw new RuntimeException("Protected Wallet has " + protectedWallet + " but you are asking -> " + money);
		}

		System.out.println(student + " is taking " + money + " from Protectected wallet -> " + protectedWallet);
		protectedWallet = protectedWallet - money;
		System.out.println(student + " has taking " + money + " from Protectected wallet -> " + protectedWallet);

		return money;
	}
}