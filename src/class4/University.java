package class4;

public class University {

	public static void main(String[] args) {
		JavaStudent balla = new JavaStudent();
		DatabaseStudent george = new DatabaseStudent();
		george.setRollNumber("100");
		george.setRollNumber("150");
		System.out.println(george);
		balla.setRollNumber("200");
		System.out.println(balla);
		balla.setRollNumber("400");
		System.out.println(balla);

		balla.setFirst("Balla");

	}

}
