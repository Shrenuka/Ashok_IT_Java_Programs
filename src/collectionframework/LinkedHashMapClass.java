package collectionframework;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapClass {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(3, "Apple");
		map.put(2, "Banana");
		map.put(5, "Orange");
		map.put(1, "Grapes");
		map.put(4, "Pineapple");
		map.put(2, "Banana");
		map.put(3, "Apple");
		map.put(2, "Banana");
		map.put(5, "Orange");
		map.put(1, "Grapes");
		map.put(4, "Watermelon"); //overrides Pineapple
		map.put(null, null);
		map.put(6, null);
		
		
		for(Map.Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println("This key is: " + entry.getKey() + " Value is: " + entry.getValue());
		}
		
		System.out.println("**********************************");
		Set<Integer> allkeys = map.keySet();
		for(Integer key : allkeys)
		{
			System.out.println("Key is: " + key + " Value is: " + map.get(key));
		}
		System.out.println("**********************************");
		
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		{
			while(itr.hasNext())
			{
				Map.Entry<Integer, String> entry = itr.next();
				System.out.println("Key is: " + entry.getKey() + " value is: " + entry.getValue());
			}
		}
		
	}

}
