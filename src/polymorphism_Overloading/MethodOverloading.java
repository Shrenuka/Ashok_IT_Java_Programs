package polymorphism_Overloading;

public class MethodOverloading {

	String empname;
	String empDesignation;
	int eage;
	String location;
	
	public static void main(String[] args) {
		MethodOverloading ec = new MethodOverloading();
		ec.empDetails();
		System.out.println("*****************");
		MethodOverloading ec1 = new MethodOverloading();
		ec1.empDetails("Jack");
		System.out.println("*****************");
		MethodOverloading ec2 = new MethodOverloading();
		ec2.empDetails("Musk","Engineer",32);

	}
	
	public void empDetails() {
		System.out.println("No param method");
	}
	
	public void empDetails(String empname) {
		this.empname=empname;
		System.out.println("Name: "+empname);
	}

	public void empDetails(String empname, String empDesignation, int eage) {
		this.empname=empname;
		this.empDesignation=empDesignation;
		this.eage=eage;
		System.out.println("Name: "+empname);
		System.out.println("Designation: "+empDesignation);
		System.out.println("Age: "+eage);
	}
	
}
