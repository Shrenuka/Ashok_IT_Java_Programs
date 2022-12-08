package Constructor;

public class Math_Cal_main {	
	
	public static void main(String[] args) {	
	
		Math_Cal ce = new Math_Cal();
		System.out.println("Addition of two numbers: "+ce.sum(4, 5));
		System.out.println("Subtraction of two numbers: "+ce.sub(14, 5));
		System.out.println("Miltiplication of two numbers: "+ce.mul(3,7));
		/*/
		Math_Cal_withconstructor mc = new Math_Cal_withconstructor();
		System.out.println(mc.sub(4, 5));
		System.out.println(mc.sum(5, 8));
		System.out.println(mc.mul(2, 3));/*/
		
	}

}
