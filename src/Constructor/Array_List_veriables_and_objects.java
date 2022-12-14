package Constructor;

import java.util.ArrayList;
import java.util.*;

public class Array_List_veriables_and_objects {

	public static void main(String args[]) {
		Math_Cal mc = new Math_Cal();
		int x=0, y=0;
		String z="Links are given ";
		Boolean stat = true;
		
		ArrayList ar = new ArrayList();
		ar.add(x);
		ar.add(y);
		ar.add(stat);
		ar.add(z);
		ar.add(mc);
		
		Iterator itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.println("Array element: "+itr.next());
			
		}
		
	}
	
}
