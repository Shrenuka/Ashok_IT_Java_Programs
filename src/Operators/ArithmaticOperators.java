package Operators;

public class ArithmaticOperators {

	public static void main(String[] args) {
		
		int a=432, b=200;
		System.out.println("Addition is "+(a+b));
		System.out.println("Subtraction is "+(a-b));
		System.out.println("Multiplication is "+(a*b));
		System.out.println("Division is "+(a/b));      //In division only quotient is considered
		System.out.println("Modulus is "+(a%b));       //In modulus only remainder is considered
		
		System.out.println(((10 * 10) / 5) + 3 - ((1 * 4) / 2));
	}

}
