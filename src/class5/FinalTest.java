package class5;

public class FinalTest {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println(c.getArea());
		System.out.println(c.getArea());
		ColoredCircle red = new ColoredCircle(5, "red");
		System.out.println(red.getArea() + " -> " + red.getColor());

	}

}

class Circle {
	private float radius;
	private final float pi = 22.0f / 7.0f;

	public Circle(float radius) {
		this.radius = radius;
	}

	public final float getArea() {
		float area = pi * radius * radius;

		return area;
	}

	public float getPermieter() {
		return 2 * pi * radius;
	}

}

final class ColoredCircle extends Circle {
	String color;

	ColoredCircle(float radius, String color) {
		super(radius);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}

//class ColorAndPaintedCirlce extends ColoredCircle{}
