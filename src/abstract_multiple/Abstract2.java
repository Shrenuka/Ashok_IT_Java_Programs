package abstract_multiple;

public abstract class Abstract2 extends BaseClass{

	float a, b;
	@Override
	public abstract float sum();

	@Override
	float sub() {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public float mul() {
		// TODO Auto-generated method stub
		return a*b;
	}
	

}
