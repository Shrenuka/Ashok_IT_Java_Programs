package MultilevelInheritance;

public class Employee_Type extends Employee {

	public Employee_Type(String ename, int empid) {
		super (ename, empid);
	}

	public void employeeType(String emptype) {
		System.out.println("This Employee is: "+emptype);
	}
}
