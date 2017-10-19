package class7.collections;

public class SortTest {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "John";
		names[1] = "Max";
		names[2] = "Simon";
		names[3] = "Mary";
		names[4] = "Ann";
		for (String s : names) {
			System.out.println(s);
		}
		displayInSortedOrder(names);
		System.out.println("-----");
		for (String s : names) {
			System.out.println(s);
		}
	}
	
	//n = 10
	//9 + 8 + 7 + 6 = ((n -1) * n /2)

	public static void displayInSortedOrder(String[] names) {
		// String[] sortedArray = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				String first = names[i];
				String second = names[j];
				if (first.compareTo(second) > 0) {
					swap(first, second, i, j, names);
					continue;
				}
			}
		}
	}

	private static void swap(String a, String b, int i, int j, String[] names) {
		String temp = a;
		names[i] = b;
		names[j] = temp;
	}

}
