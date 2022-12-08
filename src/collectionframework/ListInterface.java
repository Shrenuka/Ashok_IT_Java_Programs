package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;




public class ListInterface {

	public static void main(String[] args) {

		List list = new ArrayList<>();
		
		list.add("Java");
		list.add('c');
		list.add('c');
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
		
		//first method
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));;
		}
		System.out.println("***************************"); 
		
		//second method
		for(Object value:list)
		{
			System.out.println(value);
		}		
		System.out.println("*********************************");
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("*********************************");
		
		//This is useful when we dont know the size of list, it helps to determine size
		//as count of zero's is 14 means size is 14.
		ListIterator litr = list.listIterator();
		while(litr.hasNext())
		{
			int i=0;
			list.remove(i);
			System.out.println(litr.nextIndex());
		}
						
	}

}
