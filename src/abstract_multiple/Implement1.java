package abstract_multiple;

public class Implement1 extends Abstract1{

	public static void main(String[] args) {
		Implement1 imp1 = new Implement1();
		imp1.a=4;
		imp1.b=5;
		System.out.println("Sum is: "+imp1.sum());
		imp1.display();

	}

	@Override
	float sub() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float mul() {
		// TODO Auto-generated method stub
		return 0;
	}

}
