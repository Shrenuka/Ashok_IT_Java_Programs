package Operators;

public class RelationalOperator {

	public static void main(String[] args) {
		
		int val1=10, val2=11, age=20;
		
		System.out.println(val1>val2);  //false
		System.out.println(val1<val2);  //true
		System.out.println(val1>=val2); //false
		System.out.println(val1<=val2); //true
		System.out.println(val1==val2); //false
		System.out.println(val1!=val2); //true
		
		if (age >= 18) {
			System.out.println("Yes you can vote !!");
		} else {
			System.out.println("No you cannot vote !!");
		}
		
	}
}
