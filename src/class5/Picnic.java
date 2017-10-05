package class5;

public class Picnic {

	public static void main(String[] args) {
		Traveller t = new Traveller();
		Camera c = new Camera();
		iPhone p = new iPhone();
		t.capture(c);
		t.capture(p);
		t.capture(new Painter());

		PictureDevice pd = new Camera();
		//Camera pd = new Camera();
		pd.takePicture();
		pd.setPrice(200);
		System.out.println(pd.getPrice());

		// PictureDevice pd = new PictureDevice();
	}

}

class Traveller {
	// void capture(Camera c) {}

	// void capture(iPhone p) {}

	void capture(PictureDevice pd) {
		pd.takePicture();
	}
}

abstract class PictureDevice {
	float price;

	public void setPrice(float p) {
		this.price = p;
	}

	public float getPrice() {
		return price;
	}

	PictureDevice() {

	}

	PictureDevice(float price) {
		this.price = price;
	}

	public boolean isDiscountAvailable() {
		if (getPrice() > 200) {
			return true;
		}
		return false;
	}

	abstract void takePicture();
}

class Painter extends PictureDevice {
	void takePicture() {
		System.out.println("Painter is taking picture");
	}
}

class Camera extends PictureDevice {
	void takePicture() {
		System.out.println("Camera is taking picture");
	}

	Camera() {
		super();
	}

	Camera(float price) {
		super(price);
	}
}

class iPad extends PictureDevice {

	@Override
	void takePicture() {
		// TODO Auto-generated method stub

	}

}

class iPhone extends PictureDevice {
	void takePicture() {
		System.out.println("iPhone is taking picture");
	}
}