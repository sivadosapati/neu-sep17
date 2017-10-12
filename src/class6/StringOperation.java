package class6;

public class StringOperation {

	public static void main(String[] args) {
		String x = "Siva";
		char c = getFirstCharacter(x);
		System.out.println(c);

	}

	public static char getFirstCharacter(String s) {
		char c[] = s.toCharArray();
		return c[0];
	}

	public char getMiddleOccurence(String input) {
		// TODO Auto-generated method stub
		return 0;
	}

}
