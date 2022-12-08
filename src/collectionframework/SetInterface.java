package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		Set set = new HashSet<>();
		set.add("4anu");
		//set.add(4);
		set.add("Shiv1");
		//set.add(3);
		//set.add(5);
		set.add("Shiv0");
		/*set.add(9);
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(7);
		set.add(6);
		set.add(10);*/
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
		/*
		Collections.sort(a1);
		
		for(int i=0; i<a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}
		*/
		
		
	}

}
