package class7.collections;

import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// HashMap map = new HashMap();
		// LinkedHashMap map = new LinkedHashMap();
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("USA", "Washington DC");
		map.put("China", "Beijing");
		map.put("India", "New Delhi");
		map.put("Indonesia", "Jakarta");
		map.put("Australia", "Canberra");

		System.out.println(map);

		System.out.println(map.size());
		System.out.println(map.containsKey("India"));
		System.out.println(map.containsValue("Seattle"));
		System.out.println(map.containsValue("India"));
		map.remove("India");
		System.out.println(map.size());
		map.put("China", "New Beijing");
		System.out.println(map.get("China"));

	}
	
	

}
