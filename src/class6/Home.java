package class6;

public class Home {

	public static void main(String[] args) throws NoSaltException {
		Person cva = new Person();
		for (int i = 0; i < 5; i++) {
			// cva.cook(i);
			try {
				cva.play();
			} catch (NotFeelingWellException e) {
				System.out.println("Not Feeling well - so don't play");
			} finally {
				System.out.println("Drink Water");
			}
		}
		System.out.println("Done");
	}

}
