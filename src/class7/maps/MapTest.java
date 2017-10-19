package class7.maps;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Student, Float> gpaMap = new HashMap<Student, Float>();
		Student s = new Student("Ann", 3.85f);
		Student a = new Student("John", 3.65f);
		Student c = new Student("Ann", 3.95f);
		gpaMap.put(s, s.gpa);
		gpaMap.put(a, a.gpa);
		gpaMap.put(c, c.gpa);
		System.out.println(gpaMap);

	}

}

class Student {
	String name;
	float gpa;

	Student(String name, float gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public String toString() {
		return name + " -> " + gpa;
	}

	public boolean equals(Object o) {
		// Student s = (Student) o;
		// return s.name.equals(this.name);
		return super.equals(o);
	}

	public int hashCode() {
		// return super.hashCode();
		return this.name.hashCode();
	}
}
