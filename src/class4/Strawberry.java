package class4;

public class Strawberry extends Fruit {

	public float getDiscount() {
		getCleaned();
		if (getExpiryTimeInDays() <= 1) {
			if (price > 2) {
				return 0.25f;
			} else {
				return 0.10f;
			}
		}
		return 0;
	}

}
