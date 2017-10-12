package class6;

public class Person {

	public void cook(int index) throws NoSaltException {
		System.out.println("Start Cooking -> " + index);
		int r = getRandomNumber();
		if (r < 5) {
			NoSaltException re = new NoSaltException("I don't have salt");
			throw re;
		}
		System.out.println("End Cooking -> " + index);
	}

	int getRandomNumber() {
		return (int) (Math.random() * 10);
	}

	public void play() throws NotFeelingWellException {
		int r = getRandomNumber();
		if (r < 4) {
			throw new NotFeelingWellException("I can't play as I'm not feeling well..");
		}
		System.out.println("Play");
	}
}

class NotFeelingWellException extends Exception {
	NotFeelingWellException(String message) {
		super(message);
	}
}
