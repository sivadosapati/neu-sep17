package class4;

public class Professor {

	public void drinkWater(Bottle b) {
		checkBottle(b);
		verifyBottleToSeeThatItHasALid(b);
		ensureThatBottleHasWater(b);
		takeASipFromTheBottle(b);
		drinkWaterFromBottle(b);
	}

	private void drinkWaterFromBottle(Bottle b) {
		// TODO Auto-generated method stub

	}

	private void takeASipFromTheBottle(Bottle b) {
		// TODO Auto-generated method stub

	}

	private void ensureThatBottleHasWater(Bottle b) {
		// TODO Auto-generated method stub

	}

	private void verifyBottleToSeeThatItHasALid(Bottle b) {
		// TODO Auto-generated method stub

	}

	private void checkBottle(Bottle b) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Professor siva = new Professor();
		siva.drinkWater(new Bottle());

	}

}

class Bottle {

}
