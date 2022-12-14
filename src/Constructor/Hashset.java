package Constructor;

import java.util.*;

public class Hashset {

	public static void main(String args[]) {
		
		Math_Cal mc = new Math_Cal();
		int x=6,y=8;
		String link="Google.com";
		Boolean stat = true;
		
		HashSet hs = new HashSet();
		hs.add(x);
		hs.add(y);
		hs.add(link);
		hs.add(mc.sum(x, y));
		hs.add(mc.sub(x, y));
		hs.add(mc.mul(x, y));
		hs.add(stat);
		hs.add(x=87);
		hs.add(y=98);
		hs.add("x");
		hs.add("x");
		Iterator ltr = hs.iterator();
		while(ltr.hasNext()) {
			System.out.println("Contains: "+ltr.next());
		}
		
		
		
	}
	
}
