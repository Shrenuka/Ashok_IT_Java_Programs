package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterfaceExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2,"Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		
		for(Map.Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println("This key is: "+ entry.getKey() + " Value is: " + entry.getValue());
		}
		
		System.out.println("************************************");
		
		Set<Integer> allkeys = map.keySet();
		for(Integer key : allkeys)
		{
			System.out.println("Key is: " + key + " Value is: "+ map.get(key));
		}
		
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		{
			while(itr.hasNext())
			{
				//Map.Entry<Integer, String>
			}
		}
		
	}

}
