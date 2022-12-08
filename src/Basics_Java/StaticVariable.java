package Basics_Java;

public class StaticVariable {

	int a =10;
	static int b = 20;
	
	public static void main(String[] args) {	
				
		StaticVariable var1 = new StaticVariable();
		System.out.print(b+" ");
		System.out.println(var1.a);
		
		StaticVariable var2 = new StaticVariable();
		b++;
		var2.a++;
		System.out.print(b+" ");
		System.out.println(var2.a);
		
		StaticVariable var3 = new StaticVariable();
		b++;
		var3.a++;
		System.out.print(b+" ");
		System.out.println(var3.a);
		
		StaticVariable var4 = new StaticVariable();
		b++;
		var4.a++;
		System.out.print(b+" ");
		System.out.println(var4.a);
		
		StaticVariable var5 = new StaticVariable();
		b++;
		var5.a++;
		System.out.print(b+" ");
		System.out.println(var5.a);
		var5.a++;
		System.out.println("   "+var5.a);
		
	}

}
