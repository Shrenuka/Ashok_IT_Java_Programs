package polymorphism_Overriding;

public class CalculationImplementationClass extends CalculationClass{

	static int a, b, c;	
	
	CalculationImplementationClass(int a, int b, int c){
		
		this.a=a;
		this.b=b;
		this.c=c;
		super.a=101;
		super.b=202;		
	}
	
	public static void main(String[] args) {
		
		CalculationImplementationClass cc = new CalculationImplementationClass(100,200,300);
		cc.sum(a,b);
		cc.mul();
		cc.sub();
		cc.div(a,b);
	}
	
	public void sum(int a, int b) {
		System.out.println("I am from "+CalculationImplementationClass.class);
		System.out.println(a+b+a);
	}
	
	public void sub() {
		System.out.println("I am from "+CalculationImplementationClass.class);
		System.out.println(a-b);
	}
	
	public void mul() {
		System.out.println("I am from "+CalculationImplementationClass.class);
		System.out.println(a*b);
	}
	
	public static void div(int a, int b) {
		System.out.println("I am from "+CalculationImplementationClass.class);
		System.out.println(a/b);
	}	
	
}
