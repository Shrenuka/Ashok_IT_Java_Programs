package Constructor;

import java.util.TreeSet;

public class TreeSet_Program {

	public static void main(String args[]) {
		Math_Cal mc = new Math_Cal();
		int x=8,y=3;
		String link = "Google.com";
		TreeSet ts = new TreeSet();
		ts.add(x);
		ts.add(y);
		ts.add(mc.sum(x, y));
		ts.add(mc.sub(x, y));
		ts.add(mc.mul(x, y));
		
		System.out.print(ts);
		
		TreeSet ts_Sting = new TreeSet();
		ts_Sting.add(link);
		ts_Sting.add("sample");
		ts_Sting.add("Apple");
		
		System.out.print(ts_Sting);
		
	}
}
