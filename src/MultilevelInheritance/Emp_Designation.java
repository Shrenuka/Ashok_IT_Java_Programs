package MultilevelInheritance;

public class Emp_Designation extends Employee_Type{	
	
	
	public Emp_Designation(String ename, int empid) {
		super (ename,empid);
	}

	public static void main(String[] args) {

		Emp_Designation empDesign = new Emp_Designation("Renuka", 11);
		empDesign.display();
		empDesign.employeeType("Fresher");
		empDesign.EmployeeDesignation("Programmer");
	}
	
	public void EmployeeDesignation(String empdesign) {
		System.out.println("This Employee designation is: "+empdesign);
	}

}
