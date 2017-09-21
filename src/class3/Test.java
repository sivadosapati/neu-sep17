package class3;

public class Test {
	public static void main(String args[]) {
		String name = "Siva";// 1 Object , 1 Ref
		String other = "Kumar";// 2 Objects, 2 Ref
		String someOther = "Kumar";// 2 Objcts, 3 Ref
		String somethingElse = new String("Kumar");// 3 Objects, 4 Ref
		System.out.println(name.hashCode());
		System.out.println(other.hashCode());
		System.out.println(someOther.hashCode());
		System.out.println(someOther == somethingElse);
		System.out.println(name.concat(" Kumar"));// 4 Objects, 4 Ref
		// 3 Objects, 4 Ref
		name = name.concat(" Kumar");// 4 Objects, 4 Ref

		System.out.println(name);// 4 Objects, 4 Ref
		name = null;
		name = "Siva Kumar";
		name = null;
		String xyz = "Siva";
		xyz = null;
		String abc = new String("North Eastern University");
		abc = null;

		Pizza p = new Pizza();
		Pizza x = p;
		x = null;
		p = null;
		Pizza pp = new Pizza();

		p = pp;
		p = new Pizza();
		// p = "Siva";

	}
}

class Pizza {

}
