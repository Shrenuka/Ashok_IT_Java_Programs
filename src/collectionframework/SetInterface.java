package collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		Set set = new HashSet<>();
		
		set.add("apple");
		set.add("apple123");		
		set.add(4);		
		set.add(3);
		set.add(5);			
		set.add(9);
		set.add(0);
		set.add("123apple");
		set.add(1);
		set.add("Test"); 
		set.add(2);
		set.add(7);
		set.remove(1);
		set.add(6);
		set.add(10);
		set.remove(new String ("apple"));
		
		System.out.println(set);
		
		System.out.println("*******************************************");
		
		for(Object str : set)
		{
			System.out.println(str);
		}
		
		System.out.println("*********************");
		
		ArrayList a1 = new ArrayList();
		a1.addAll(set);
		
		for(int i=0; i<a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}

		System.out.println("*********************");		
		
		set.add(1);
		Iterator setitr = set.iterator();
		while(setitr.hasNext())
		{
			System.out.println(setitr.next());
		}		
		
	}

}
