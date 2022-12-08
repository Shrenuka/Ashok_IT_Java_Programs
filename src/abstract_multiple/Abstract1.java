package abstract_multiple;

public abstract class Abstract1 extends BaseClass{

	float a, b;
	
	
	@Override
	public float sum() {
		return a+b;
		
	}


	abstract float sub();


	public abstract float mul();


}
