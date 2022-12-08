package abstraction;

public class Cycle extends Vehical{

	 float price;


	public Cycle(String vname, int seat, float price) {
		super(vname, seat);
		this.price=price;
	}		
	

	@Override
	public void engine() {
		System.out.println("This cycle does not have engine");
		
	}


	@Override
	public void name(String vname) {
		System.out.println("Name of the Cycle is "+vname);
		
	}


	@Override
	public void seat(int seat) {
		System.out.println("The vehical is "+seat+" seater");
		
	}

}
