package class4;

public class Orange extends Fruit {
	private float juiceLevels;

	public float getJuiceLevels() {
		return juiceLevels;
	}

	public void setJuiceLevels(float juiceLevels) {
		this.juiceLevels = juiceLevels;
	}

	public Orange(int price, String color, float weight, int expiry) {
		super(price, color, weight, expiry);
		// super();
	}

	public Orange() {

	}

	public void eat() {
		System.out.println("Eating Orange");
		System.out.println("Clean your hands");
	}

	@Override
	public float getDiscount() {

		return 0;
	}
}
