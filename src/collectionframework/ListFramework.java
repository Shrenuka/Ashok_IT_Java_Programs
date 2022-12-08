package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListFramework {

	public static void main(String[] args) {

		List list = new ArrayList<>();
		
		list.add("Java");
		list.add(11);
		list.add("orange");
		list.add("remove");
		list.add(1.2);
		list.add("apple");
		list.add("practice");
		list.add('c');
		list.add(true);
		list.add("Hii");
		list.add("Test");
		list.add(1);
		
		/*first method
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));;
		}
		System.out.println("***************************"); */
		
		//second method
		for(Object value:list)
		{
			System.out.println(value);
		}
		
		System.out.println("*********************************");
		
		System.out.println("Does list contain '100': "+list.contains(100));
		System.out.println("Index of 'true': "+list.indexOf(true));
		System.out.println("Get value of index (2): "+list.get(2));
		System.out.println("Removed 'practice': "+list.remove(new String ("practice")));
		
		System.out.println("*********************************");
		
		List list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		list1.add(90);
		list1.add(100);
		list1.add(110);
		list1.add(120);
		list1.add(130);
		
		for(Object value:list1)
		{
			System.out.println(value);
			
		}
		System.out.println("*********************************");
		
		System.out.println("Index of '40: " + list1.indexOf(40));
		
		System.out.println("Removed index (0): " + list1.remove(0)); //removed & print index 1 value
		
		System.out.println("Does list1 contain 'Test': " + list1.contains("Test"));
		
		System.out.println("Removed 110: "+ list1.remove(new Integer(110))); //removed value
		
		
		System.out.println("*********************************");
		
		for(Object value:list1)
		{
			System.out.println(value);
		}
				
	}

}
