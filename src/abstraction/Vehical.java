package abstraction;

public abstract class Vehical {

	String vname;
	int seat;
		
	public Vehical(String vname, int seat) {
		super();
		this.vname = vname;
		this.seat = seat;
		
	}
	
	public abstract void name(String name);
	public abstract void seat(int seat);
	public abstract void engine();
	
	
	public void shop_location(String city) {
		System.out.println("The shop is located at "+city);
	}
	
	public void price(float price) {
		System.out.println("Price of vehical is "+price);
	}
	
}
