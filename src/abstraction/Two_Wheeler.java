package abstraction;

public abstract class Two_Wheeler extends Vehical{
	
	
	public Two_Wheeler(String vname, int seat) {
		super(vname, seat);
		super.seat= 2;
		super.vname="Passion";
		
	}

	@Override
	public void name(String vname) {
		System.out.println("Name of two wheeler is "+vname);
		
	}

	@Override
	public void seat(int seat) {
		System.out.println("The vehical is "+seat+" seater");
		
	}
	
	public abstract void engine();

}
