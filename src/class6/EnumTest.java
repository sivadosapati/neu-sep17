package class6;

public class EnumTest {
	public static void main(String args[]) {
		Ball b = new Ball();
		b.setColor("red");
		b.setColor("r");
		b.ballColor = Color.BLUE;

		Human h = new Human();
		h.gender = Gender.MALE;
		System.out.println(h.gender.getPrefix());
		for (Color c : Color.values()) {
			System.out.println(c);
		}
	}
}

class Ball {
	private String color;
	public Color ballColor;

	public void setColor(String c) {
		if (c.equalsIgnoreCase("red")) {

			this.color = c;

		}
	}

}

enum Color {
	RED, BLUE, YELLOW, ORANGE, PURPLE
}

enum Gender {
	MALE("Mr"), FEMALE("Miss");

	String prefix;

	Gender(String prefix) {
		this.prefix = prefix;
	}

	public String getPrefix() {
		return prefix;
	}

}

class Human {
	Gender gender;
}