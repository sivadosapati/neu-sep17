package class5.interfaces;

public class Picnic {

	public static void main(String[] args) {
		Traveller t = new Traveller();
		Camera c = new Camera();
		iPhone p = new iPhone();
		
		PictureDevice pd = p;
		t.capture(c);
		t.capture(p);
		t.capture(new Painter());

		pd = new Camera();
		// Camera pd = new Camera();
		pd.takePicture();

		// PictureDevice pd = new PictureDevice();

		Phone lp = new LandlinePhone();
		Phone ip = p;
		t.makePhoneCall(ip, lp);
		t.makePhoneCall(lp, ip);
	}

}

class Traveller {
	// void capture(Camera c) {}

	// void capture(iPhone p) {}

	void capture(PictureDevice pd) {
		pd.takePicture();
	}

	void makePhoneCall(Phone source, Phone target) {
		source.makeCall(target);
	}
}

interface PictureDevice {
	void takePicture();
}

class LandlinePhone implements Phone {

	@Override
	public void makeCall(Phone p) {
		System.out.println("landline phone making call");

	}

	@Override
	public void receiveCall(Phone p) {
		System.out.println("landline phone receiving call");

	}

}

class Painter implements PictureDevice {
	public void takePicture() {
		System.out.println("Painter is taking picture");
	}
}

class Camera implements PictureDevice {
	public void takePicture() {
		System.out.println("Camera is taking picture");
	}

}

class iPad implements PictureDevice {

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub

	}

}

interface Phone {
	void makeCall(Phone p);

	void receiveCall(Phone p);
}

class iPhone implements Phone, PictureDevice {

	public void takePicture() {
		System.out.println("iPhone is taking picture");
	}

	@Override
	public void makeCall(Phone p) {
		System.out.println("iPhone is making call to a phone");

	}

	@Override
	public void receiveCall(Phone p) {
		System.out.println("iPhone is receiving call");

	}
}