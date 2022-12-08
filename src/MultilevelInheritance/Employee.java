package MultilevelInheritance;

public class Employee {

	int empid;
	String empname;
	static String companyname = "Dancera Company";
	
	public Employee(String ename, int empid) {
		this.empname=ename;
		this.empid=empid;		
	}

	public void display() {
		
		System.out.println("Name of the Employee is: "+empname);
		System.out.println("Id of the Employee is: "+empid);
		System.out.println("Company name of the Employee: "+companyname);
	}
}
