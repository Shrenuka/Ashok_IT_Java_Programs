package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListFramework {

	public static void main(String[] args) {

		List list = new ArrayList<>();
		
		list.add("Renuka");
		list.add(1);
		list.add("Test");
		list.add("Test");
		list.add(1.2);
		list.add("Test");
		list.add("Test");
		list.add('c');
		list.add(true);
		list.add("Test");
		list.add("Test");
		list.add(1);
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));;
		}
		System.out.println("***************************");
		
		for(Object value:list)
		{
			//System.out.println(value);
		}
		System.out.println("***************************");
		
		//System.out.println("List contains 100 "+list.contains(100));
		//System.out.println("Index of list "+list.indexOf(true));
		//System.out.println("Get index of 2 "+list.get(2));
		//System.out.println("***************************");
		//System.out.println("Remove index of 0 "+list.remove(0));
		
		list.remove(3);
		//list.remove(new String("Test"));
		
		for(Object value:list)
		{
			System.out.println(value);
		}
		
	}

}
