package Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int num1=95, num2=93, num3=98;
		boolean bool=true;
		
		System.out.println(num1>num2 && num1>num3); //95>93 && 95>98  //true && false //false
		System.out.println(num1>num2 || num1>num3); //95>93 || 95>98  //true || false //true
		System.out.println(!bool); //false
			
	}

}
