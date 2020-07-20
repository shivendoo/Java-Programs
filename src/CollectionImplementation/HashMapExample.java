package CollectionImplementation;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> hashMapObject = new HashMap<Integer, String>();
		hashMapObject.put(1, "shiven");
		hashMapObject.put(2, "kanpur");
		hashMapObject.put(3, "mathura");
		hashMapObject.put(4, "jaipur");
		hashMapObject.put(5, "lucknow");
		hashMapObject.put(6, "noida");
		hashMapObject.put(7, "bhopal");
		
		
		System.out.println("81 :"+hashMapObject.putIfAbsent(8, "Delhi"));
		System.out.println("82 :"+hashMapObject.putIfAbsent(8, "Delhi Cant"));
		System.out.println("91 :"+hashMapObject.put(9, "Rajasthan"));
		System.out.println("92 :"+hashMapObject.put(9, "Rajasthan Cant"));
		
		Set<Integer> st = hashMapObject.keySet();
		Collection<String> val = hashMapObject.values();
		Set<Map.Entry<Integer, String>> entryset = hashMapObject.entrySet();
		
//		System.out.println("map object " + hashMapObject);
//		System.out.println("Key set is ->" + st);
//		System.out.println("Collection of values :" + val);
		System.out.println("Entry set of map object :" + entryset);

		
//		System.out.println(" remvoe object " +hashMapObject.remove(8,"Delhi"));		
//		System.out.println(" replace object " +hashMapObject.replace(9,"New Rajasthan"));
//		System.out.println(" replace object " +hashMapObject.replace(7,"bhopal","New Bhopal"));
//		System.out.println(" replace object " +hashMapObject.replace(6,"kanpur","New noida"));
		
		System.out.println("**********************");
		

//		System.out.println("map object " + hashMapObject);
//		System.out.println("Key set is ->" + st);
//		System.out.println("Collection of values :" + val);
		System.out.println("Entry set of map object :" + entryset);

//		System.out.println("Iteration of entry set ");
//		// for (Map.Entry<Integer, String> entryPair : entryset) {
//		for (Map.Entry entryPair : hashMapObject.entrySet()) {
//			System.out.print("Keys :" + entryPair.getKey());
//			System.out.println(" value :" + entryPair.getValue());
//		}
		// short by value

	}
}
