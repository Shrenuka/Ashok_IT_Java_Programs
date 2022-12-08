package abstract_multiple;

public class Implement3 extends Abstract3{

	public static void main(String[] args) {
		Implement3 imp3 = new Implement3();
		imp3.a=7;
		imp3.b=6;
		System.out.println("Sum is: "+imp3.sum());
		System.out.println("Sub is: "+imp3.sub());
		System.out.println("Mul is: "+imp3.mul());
		imp3.display();

	}

}
