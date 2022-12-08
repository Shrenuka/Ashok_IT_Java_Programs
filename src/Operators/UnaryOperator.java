package Operators;

public class UnaryOperator {

	public static void main(String[] args) {
		
		int a=1, b=1, c=1, d=1;
		
		System.out.println("Before postfix increment: "+a);	
		System.out.println("After postfix increment: "+a++);
		
		System.out.println("************************");
		
		System.out.println("Before prefix increment: "+b);		
		System.out.println("After prefix increment: "+ ++b);
		
		System.out.println("************************");	
		
		System.out.println("Before postfix decrement: "+c);		
		System.out.println("After postfix decrement: "+c--);
		
		System.out.println("************************");
		
		System.out.println("Before prefix decrement: "+d);		
		System.out.println("After prefix decrement: "+ --d);		
	}

}
