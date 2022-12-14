package Constructor;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_1 {

	public static void main(String args[]) {
		
		Math_Cal mc = new Math_Cal();
		int x=2,y=4;
		String link="gogle.com";
		Boolean stat=true;
		ArrayList ar = new ArrayList();
		
		ar.add(x);
		ar.add(y);
		ar.add(stat);
		ar.add(mc.sum(8, 6));
		ar.add(mc.sub(x, y));
		ar.add(mc.mul(x, y));
		ar.add(link);
		ListIterator ltr = ar.listIterator();
		while(ltr.hasNext()) {
			System.out.println("Next: "+ltr.next());
		}	
		while(ltr.hasPrevious()) {
			System.out.println("Previous: "+ltr.previous());	
		}
	}
}
