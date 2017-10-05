package class3;

public class AppleStore {
	int x ;
	public String y;
	public static void main(String args[]) {
		iPhone i = new iPhone();
		System.out.println(i);
		i.color = "Pink";
		System.out.println(i);

		iPhone annsPhone = new iPhone("Silver", 5, 7, 256);
		System.out.println(annsPhone);

		iPhone yunaPhone = new iPhone("Rose Gold");
		System.out.println(yunaPhone);
		yunaPhone.init();
		yunaPhone.init();
		// yunaPhone.yunaPhone();
	}
}

class iPhone {
	private static final int DEFAULT_MEMORY = 256;
	private static final int DEFAULT_SCREEN_SIZE = 7;
	private static final int DEFAULT_TYPE = 8;
	private static final String DEFAULT_COLOR = "Black";
	String color;
	float screenSize;
	int type;
	int memory;

	iPhone(String c) {
		this(c, DEFAULT_TYPE, DEFAULT_SCREEN_SIZE, DEFAULT_MEMORY);
		// color = c;
		// init();
	}

	void init() {
		screenSize = 7;
		type = 8;
		memory = 128;

	}

	iPhone() {
		this(DEFAULT_COLOR, DEFAULT_TYPE, DEFAULT_SCREEN_SIZE, DEFAULT_MEMORY);
		System.out.println("New Default iPhone is created");
	}

	iPhone(String c, float screenSize, int type, int memory) {
		System.out.println("New iPhone");

		this.color = c;
		this.screenSize = screenSize;
		this.type = type;
		this.memory = memory;
	}

	public String toString() {
		return "Color -> " + color + " Screen Size -> " + screenSize + " Type -> " + type + " Memory -> " + memory;
	}

}