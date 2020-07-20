package CollectionImplementation;

import java.util.Comparator;
import java.util.*;

public class MapComparator implements Comparator <String>{

	@Override
	public int compare(String o1, String o2) {
//	String  b1 = new StringBuffer(o1).reverse().toString();
//	String  b2 = new StringBuffer(o2).reverse().toString();
//	return b1.compareTo(b2);
		
		return o1.compareTo(o2);
	}
	

}
