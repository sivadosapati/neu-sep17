package class1;

public class Customer {

	// Data
	// <type> <name>;
	String name;
	String userName;
	String password;
	String address;
	String phone;
	CreditCard creditCard;

	// Behaviors - <output> name(<input1>, <input2>,);

	LoginPage login(Website website) {
		boolean response = website.validate(userName, password);
		if (response == true) {
			LoginPage lp = website.getLoginPage(userName);
			String message = lp.getMessage();
			System.out.println(message);
			return lp;
		} else {
			System.out.println(userName + " is unauthorized to log in website");
		}
		return null;
	}

}

class Website {
	boolean validate(String userName, String password) {
		// return true;
		// Logic to validate

		if (userName.startsWith("A")) {
			return true;
		}
		if (userName.startsWith("B")) {
			return true;
		}
		if (userName.startsWith("C")) {
			return true;
		}
		return false;

	}

	LoginPage getLoginPage(String userName) {
		// Create Object - new <name_of_the_class>();
		LoginPage lp = new LoginPage();
		lp.message = "Hi, " + userName;
		return lp;

	}
}

class LoginPage {
	String message;

	String getMessage() {
		return message;
	}

}

class CreditCard {
	String number;
	String nameOfCompany;
	int expiryMonth;
	int expiryYear;
	String securityCode;
	// boolean chip;
}