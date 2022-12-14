package Constructor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapClass {

	public static void main(String args[]) {
		
		HashMap<String, String> hm = new HashMap();
		hm.put("Name", "Shivaji");
		hm.put("Class", "B.Tech");
		System.out.println("This Contains: "+hm);
		Collection<String> cv = hm.values();
		System.out.print(cv);
	}
}
