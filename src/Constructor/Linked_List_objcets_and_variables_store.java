package Constructor;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List_objcets_and_variables_store {

	public static void main(String args[]) {
		
		Math_Cal mc = new Math_Cal();
		int x=4, y =10;
		String stat = "Print status of array";
		Boolean z = true;
		
		LinkedList ll = new LinkedList();
		ll.add(x);
		ll.add(y);
		ll.add(stat);
		ll.add(z);
		ll.add(mc);
		ll.add(z);
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			
			System.out.println("Contains: "+itr.next());
		}
		System.out.println("Sum: ");		
	}
}
