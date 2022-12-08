package collectionframework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class ListLinkedListClass {

	public static void main(String[] args) {
		
		LinkedList linkedlist = new LinkedList<>();
		LinkedList<Object> linkedlist1 = new LinkedList<Object>();
		
		linkedlist.add("Apple");
		linkedlist.add('F');
		linkedlist.add(111);
		linkedlist.add(true);
		
		System.out.println(linkedlist);
		
		System.out.println("************************");
		
		for(int i=0; i<linkedlist.size(); i++)
		{
			System.out.println(linkedlist.get(i));			
		}
		
		System.out.println("************************");
		
		for(Object obj: linkedlist)
		{
			System.out.println(obj);
		}
		
		System.out.println("************************");
		
		linkedlist.addFirst("FirstFruit");
		linkedlist.addLast("LastFruit");
		linkedlist.addFirst("Reverse");
		linkedlist.offerFirst(34);
		linkedlist.remove(new Integer(34));
				
		for(Object obj : linkedlist)
		{
			System.out.println(obj);
		}

		System.out.println("************************");
		
		linkedlist1.addAll(linkedlist);
		linkedlist1.offer(34);
		
		for(Object obj : linkedlist1)
		{
			System.out.println(obj);
		}
		System.out.println("*************************");
		
		Collections.reverse(linkedlist1);
		
		for(Object obj : linkedlist1)
		{
			System.out.println(obj);
		}
		
		/*
		Iterator list1 = linkedlist1.iterator();		
		while(list1.hasNext())
		{
			System.out.println(list1.next());
		} */
		
		
		
		
	}

}
