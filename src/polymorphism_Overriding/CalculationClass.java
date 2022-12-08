package polymorphism_Overriding;

public class CalculationClass {

	int a, b;
	
	void sum() {
		System.out.println("I am from "+CalculationClass.class);
		System.out.println(a+b);
	}
	
	public void sub() {
		System.out.println("I am from "+CalculationClass.class);
		System.out.println("a-b");
	}
	
	private void mul() {
		System.out.println("I am from "+CalculationClass.class);
		System.out.println(a*b);
	}
	
	public static void div(int a, int b) {
		System.out.println("I am from "+CalculationClass.class);
		System.out.println(a/b);
	}
	
}
/*	
Overriding-->
--------------
Same method name, signature, parameters

We can increase the scope of overridden methods

static, final, and private methods cannot be overridden

We can make overridden methods as final, so that if child class extends cannot change its behaviour

We cannot make overridden methods as static in child class

*/