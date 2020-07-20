package CollectionImplementation;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {

		// ***** TreeMap
		Map<Integer, String> treeMapObj = new TreeMap<>();
		treeMapObj.put(6, "shiven");
		treeMapObj.put(1, "kanpur");
		treeMapObj.put(3, "mathura");
		treeMapObj.put(7, "jaipur");
		treeMapObj.put(5, "lucknow");
		treeMapObj.put(2, "noida");
		treeMapObj.put(4, "bhopal");

		System.out.println("TreeMap : " + treeMapObj);

		// TreeMap using Compartor MapComparator
		// Map<Integer,String> treeMapComp = new TreeMap<>();
		Comparator<String> comp = new MapComparator();
		Comparator<String> comp1 = comp.reversed();
		Map<String, Integer> treeMapComp1 = new TreeMap(comp1);
		System.out.println("***********TreeMap using Compartor MapComparator");
		treeMapComp1.put("shiven", 7);
		treeMapComp1.put("kanpur", 8);
		treeMapComp1.put("mathura", 9);
		treeMapComp1.put("jaipur", 1);
		treeMapComp1.put("lucknow", 2);
		treeMapComp1.put("noida", 6);
		treeMapComp1.put("bhopal", 4);

		System.out.println("TreeMap : " + treeMapComp1);

	}
}
