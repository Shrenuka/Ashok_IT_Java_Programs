package polymorphism_Overloading;

public class DatatypeOverloading {

	public static void main(String[] args) {
		
		DatatypeOverloading dataover = new DatatypeOverloading();
		System.out.print(dataover.sum(10, 20.198f));
		
		System.out.println();
		System.out.println("*******************");
		
		DatatypeOverloading dataover1 = new DatatypeOverloading();
		System.out.print(dataover1.sum(234, 63524253000l));
		
		System.out.println();
		System.out.println("*******************");
		
		DatatypeOverloading dataover2 = new DatatypeOverloading();
		System.out.print(dataover2.sum((long)5, 5));		
		
		System.out.println();
		System.out.println("*******************");
		
		//DatatypeOverloading dataover3 = new DatatypeOverloading();
		//System.out.print(dataover3.sum(5, 5)); //error will throw as-> method is ambiguous
		
		
	}
	
	public float sum(float a, int b) {
		return (a+b);
	}
	
	public float sum(int a, float b) {
		return (a+b);
	}
	
	public long sum(int a, long b) {
		return a+b;
	}
	
	public int sum(long a, int b) {
		return (int)(a+b);
	}

}
