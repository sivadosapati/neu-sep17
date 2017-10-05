package class5.stat;

public class StaticTest {
	int x = 10;
	static int y = 10;

	public void print(){
		System.out.println("Print something");
	}
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.print();
		System.out.println(y);
		System.out.println(NEUStudentForSep17JavaClass.isProfessorHealthy());
		NEUStudentForSep17JavaClass.p.name = "Cva";
		NEUStudentForSep17JavaClass.p.healthy = false;
		System.out.println(NEUStudentForSep17JavaClass.isProfessorHealthy());
		
		NEUStudentForSep17JavaClass camille = new NEUStudentForSep17JavaClass("Camille");
		NEUStudentForSep17JavaClass ann = new NEUStudentForSep17JavaClass("Ann");
		// Professor siva = new Professor();
		System.out.println(camille.toString());
		System.out.println(ann.toString());
		ann.p.healthy = false;
		System.out.println("-------");
		System.out.println(camille.toString());
		System.out.println(ann.toString());
		NEUStudentForSep17JavaClass.p.healthy = true;
		NEUStudentForSep17JavaClass.p.name = "Siva Dosapati";
		System.out.println("-------");
		System.out.println(camille.toString());
		System.out.println(ann.toString());
		// camille.p = null;
		// System.out.println("-------");
		// System.out.println(camille.toString());
		// System.out.println(ann.toString());
		System.out.println(camille.sum(10, 15));
		System.out.println(NEUStudentForSep17JavaClass.sum(10, 15));
		NEUStudentForSep17JavaClass.p.healthy = false;
		System.out.println(camille.isProfessorHealthy());
		System.out.println(ann.isProfessorHealthy());
		
		System.out.println(NEUStudentForSep17JavaClass.isProfessorHealthy());
	}

}

class NEUStudentForSep17JavaClass {
	String name;
	static Professor p = new Professor("Siva");

	NEUStudentForSep17JavaClass(String name) {
		this.name = name;
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static boolean isProfessorHealthy() {
		return p.healthy;
	}

	public String toString() {
		return "Student Name -> " + name + " is learning from professor -> " + p.name + " and professor is "
				+ p.getHealthStatus();
	}
}

class Professor {
	String name;
	boolean healthy = true;

	Professor(String name) {
		this.name = name;
	}

	public String getHealthStatus() {
		if (healthy) {
			return "Healthy";
		}
		return "not healthy";
	}
}
