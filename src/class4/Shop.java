package class4;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.LocatorEx.Snapshot;

public class Shop {

	public static void main(String[] args) {
		Strawberry s = new Strawberry();
		Apple a = new Apple();
		a.setHardnessFactor(25);
		a.setPrice(3);
		System.out.println(a);
		System.out.println(a.getHardnessFactor());
		// a.setPrice(2);
		// System.out.println(a);
		// Orange o = new Orange();
		Orange o = new Orange(2, "orange", 50, 2);
		o.setJuiceLevels(0.56f);
		System.out.println(o.getJuiceLevels());
		System.out.println("------------------");
		a.setExpiryTimeInDays(1);
		System.out.println(a.getDiscount());
		System.out.println(o.getDiscount());
		System.out.println(o.getClass().getName());
		// Orange oo = new Orange();
		// o.setPrice(1);
		// System.out.println(o);
		System.out.println("----------------EAT------");
		a.eat();
		o.eat();
		Thing t = new Thing();
		t.eat();
		Fruit f = new Fruit();
		f.eat();
		Strawberry sb = new Strawberry();
		sb.eat();

	}

}
