package ControlStatements;

public class NarrowingWidening {

	public static void main(String[] args) {
		
		//Widening **********************
		
		short sh = 90;
		byte b = 30;

		int i = sh + 90;
		int j = b + 900;

		long l = (long) i;
		//long ll = (long) j;

		System.out.println("value of i is " + i);
		System.out.println("value of j is " + j);
		
		/*float f = i;
		float ff = b;

		double d = sh;
		double dd = b;  */
		
		//Narrowing **********************
		
		long la = 90;
		int a = (int) l;
		byte bb = (byte) a;
		short ss = (short) a;

		System.out.println("Value of l is " + la);
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + bb);
		System.out.println("Value of sh is " + ss);
		
				
		//smaller values cannot be stored in smaller datatype if any operation is performed on them
		//eg 
		short bc = (short)(bb + 450);
		byte cc = (byte)(bb + 10);
		short s = (short)(bc + cc);
		
		int x =bb;
		int y = cc;
		int k = s;
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		System.out.println("Value of k is "+k);
		
	}

}
