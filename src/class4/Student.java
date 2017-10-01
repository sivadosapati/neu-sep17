package class4;

public class Student {
	private String rollNumber;
	private float gpa;
	private String[] classNames = new String[10];
	private String first, last;
	private String loginId;
	private String loginPwd;
	private boolean passed;

	private boolean firstNameSet = false;

	public void setFirst(String first) {
		if (this.first == null) {
			this.first = first;
			return;
		}
		System.out.println(
				"First Name was already set to -> " + this.first + ". So you can't set the first name to -> " + first);

	}

	public void setFirstOld(String first) {
		if (firstNameSet == false) {
			this.first = first;
			firstNameSet = true;
		} else {
			System.out.println("First Name was already set to -> " + this.first
					+ ". So you can't set the first name to -> " + first);
		}
	}

	public String getFirst() {
		return first;
	}

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean b) {
		this.passed = b;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		if (gpa >= 0 && gpa <= 4.0f) {
			this.gpa = gpa;
		} else {
			throw new IllegalArgumentException("Gpa[" + gpa + "] has to be between 0 and 4");
		}
	}

	public Student() {

	}

	public boolean isNameStartingWith(String string) {
		/*char[] ch = string.toCharArray();
		char[] charactersInFirst = this.first.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (charactersInFirst[i] != ch[i]) {
				return false;
			}
		}
		return true;
		*/
		return first.startsWith(string);
	}

	public Student(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		validateRollNumber(rollNumber);
		this.rollNumber = rollNumber;
	}

	private void validateRollNumber(String rollNumber) {
		if (rollNumber == "-1") {
			throw new IllegalArgumentException(rollNumber + " can't be negative");
		}
		if (this.rollNumber != null) {
			throw new IllegalArgumentException(rollNumber + " can't be set again");

		}
	}

	public String getRollNumber() {
		return rollNumber;
	}
}
