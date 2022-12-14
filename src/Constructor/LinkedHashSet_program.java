package Constructor;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_program {

	public static void main(String args[]) {
		Math_Cal mc = new Math_Cal();
		int x = 8, y=6;
		String link="Google.com";
		Boolean stat = true;
		LinkedHashSet<Integer> LHS = new LinkedHashSet<Integer>();
		LHS.add(x);
		LHS.add(y);
		LHS.add(mc.sum(x, y));
		LHS.add(mc.sub(x, y));
		LHS.add(mc.mul(x, y));
		
		
		Iterator itr = LHS.iterator();
		while(itr.hasNext()) {
			System.out.println("COntains: "+itr.next());
		}
		
	}

	
}
