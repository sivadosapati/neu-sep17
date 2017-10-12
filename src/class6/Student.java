package class6;

public class Student {

	public void cleanPhoneAndMakeCall(Phone p, String number) {
		p.clean();
		try {
			makePhoneCall(p, number);
			return;
		} catch (Exception e) {
			System.out.println("I can't make a phone call as I don't have the code");
		} finally {
			System.out.println("DONE");
		}

	}

	public void cleanPhoneAndMakeCallInADifferentWay(Phone p, String number) throws NoPhoneCodeException {
		p.clean();
		makePhoneCall(p, number);
	}

	public void makePhoneCall(Phone p, String number) {
		if (p.getCode() == null) {
			throw new NoPhoneCodeException(100);
		}
		p.unlock();
		p.dial(number);
		p.speak();
	}
}

class NoPhoneCodeException extends RuntimeException {
	
	private int number;
	NoPhoneCodeException(){
		
	}
	NoPhoneCodeException(int number){
		this.number = number;
	}

}

class Phone {
	void clean() {
	}

	void unlock() {
	}

	String getCode() {
		return "123";
	}

	void dial(String number) {
	}

	void speak() {
	}
}