package Operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		int a=10, b=20, c;
		
		System.out.println(c=a+b);     //= is assignment operator		
		System.out.println(c=a*b);
		System.out.println(c=a-b);
		System.out.println("***********************");
		
		//Without third variable
		System.out.println(a+=b); //value is stored in a
		System.out.println(a-=b); //value is stored in a
		System.out.println(a*=b); //value is stored in a
		System.out.println("***********************");		
		
		System.out.println(a);   //value in "a" will be (a=a*b)(latest value of "a")
		System.out.println(b);
		System.out.println(c);   //value of "c" will be (c=a-b)(latest value of "c")
		
		
	}

}
