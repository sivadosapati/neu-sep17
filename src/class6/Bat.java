package class6;

public class Bat {
	private static int numberOfBats = 0;

	public Bat() {
		System.out.println("Bat is constructed");
		numberOfBats++;
		System.out.println("Total Number of Bats -> " + numberOfBats);
	}

	public void finalize() {
		System.out.println("Bat is destructed");
		numberOfBats--;
		System.out.println("Total Number of Bats -> " + numberOfBats);
	}

	public static void main(String args[]) throws Exception {
		Bat b = new Bat();
		Bat bb = new Bat();
		b = null;
		bb = null;
		System.gc();
		// Runtime.getRuntime().runFinalization();
		// Thread.sleep(5000);
		System.out.println("END");

	}
}
