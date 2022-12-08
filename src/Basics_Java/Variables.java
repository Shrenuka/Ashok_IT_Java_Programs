package Basics_Java;

public class Variables {

	int a=10, b=20;                //instance variables
	static int c=30;
	
	public static void main(String[] args) {
		
		int d=40;                         //d is local variable
		Variables val = new Variables();  //object creation
		System.out.println(val.a);
		System.out.println(val.b);
		System.out.println(c);
		c=c+1;                            //c is now 31
		System.out.println(c); 
		System.out.println(val.a+val.b+c+d);
		
		Variables val1 = new Variables();
		c=c+1;
		System.out.println(val1.a+val1.b+c+d);
		//System.out.println(a+b+c+d);    //error-- we can not use instance variables (a,b) without creating object
		val.sum();                       //method is invoked by using object
		val1.sum();

	}
	public void sum() {
		int d=90;
		System.out.println(a+b+c+d);
	}
	

}
