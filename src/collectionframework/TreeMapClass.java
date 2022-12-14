package collectionframework;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Orange", 3);
		map.put("Grapes", 4);
		//map.put(null, null); error NullPointerException
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Orange", 3);
		map.put("Grapes", 4);
		//map.put(null, null); error NullPointerException
		map.put("Pineapple", null);
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println("The key is: " + entry.getKey() + " Value is: " + entry.getValue());
		}
		System.out.println("**********************************");
		
		Set<String> allkeys = map.keySet();
		for(String key : allkeys)
		{
			System.out.println("Key is: " + key + " Value is: " + map.get(key));
		}
		System.out.println("**********************************");
		
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		{
			while(itr.hasNext())
			{
				Map.Entry<String, Integer> entry = itr.next();
				System.out.println("The key is: " + entry.getKey() + " Value is: " + entry.getValue());
			}
		}

	}

}
