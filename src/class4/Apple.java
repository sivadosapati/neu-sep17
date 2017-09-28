package class4;

public class Apple extends Fruit {
	private int hardnessFactor;

	public int getHardnessFactor() {
		return hardnessFactor;
	}

	public void eat() {
		
	}

	public void setHardnessFactor(int hardnessFactor) {
		this.hardnessFactor = hardnessFactor;
	}

	public Apple() {
		// super(25,"black",25,10);
		System.out.println("Apple is created");
	}

	@Override
	public float getDiscount() {
		float x = super.getDiscount();
		if (x != 0) {
			return x + 0.10f;
		}
		return x;
	}
}
