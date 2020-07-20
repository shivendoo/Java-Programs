package CollectionImplementation;

import java.util.*;

public class HashMapSorting {
	HashMapSorting sd = new HashMapSorting();

	public static void main(String[] args) {

		// ******** HashMap
		Map<Integer, String> hashMapObject = new HashMap<Integer, String>();

		hashMapObject.put(6, "shiven");
		hashMapObject.put(1, "kanpur");
		hashMapObject.put(3, "mathura");
		hashMapObject.put(7, "jaipur");
		hashMapObject.put(5, "lucknow");
		hashMapObject.put(2, "noida");
		hashMapObject.put(4, "bhopal");

		System.out.println("HashMap : " + hashMapObject);
		Set<Map.Entry<Integer, String>> valEntry = hashMapObject.entrySet();
		System.out.println("Hash map Entry set :" + valEntry);

		// sort hashmap using List of <Map.Entry<Integer,String>> objects

		List<Map.Entry<Integer, String>> valueList = new ArrayList<Map.Entry<Integer, String>>(valEntry);
		// short with the help of compartor with the help of *** Anonymous class ***
		Collections.sort(valueList, new Comparator<Map.Entry<Integer, String>>() {
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		System.out.println("**** HashMap sorted by values is : " + valueList);

		// reverse sort with the help of Comparator As Lambada Expression

		Collections.sort(valueList, (Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) -> o2.getValue()
				.compareTo(o1.getValue()));
		System.out.println("**** HashMap sorted by values in decending order by lambada : " + valueList);

		// *** LinkedHashMap
		Map<Integer, String> LinkedMapObject = new LinkedHashMap<Integer, String>();
		LinkedMapObject.put(6, "shiven");
		LinkedMapObject.put(1, "kanpur");
		LinkedMapObject.put(3, "mathura");
		LinkedMapObject.put(7, "jaipur");
		LinkedMapObject.put(5, "lucknow");
		LinkedMapObject.put(2, "noida");
		LinkedMapObject.put(4, "bhopal");
		System.out.println("LinkedHashMap : " + LinkedMapObject);
		// Map<Integer, String> hasmap11 = new HashMap<Integer,
		// String>(LinkedMapObject);
		// System.out.println("hasmap11 : "+hasmap11);

	}

}
