package abstract_multiple;

public class Implement2 extends Abstract2{

	public static void main(String[] args) {
		Implement2 imp2 = new Implement2();
		imp2.a=3;
		imp2.b=1;
		System.out.println("Sub is: "+imp2.sub());
		System.out.println("Mul is: "+imp2.mul());
		imp2.display();

	}

	@Override
	public float sum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
