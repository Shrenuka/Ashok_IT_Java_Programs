package abstraction;

public class EmployeeDetails extends Employee{

	public EmployeeDetails(String name, int age, String designation) {
		super(name, age, designation);
		age=20;
		System.out.println("constructor age: "+age);
	}

	public static void main(String[] args) {
		EmployeeDetails empdetails = new EmployeeDetails("Renuka", 32, "Automation Tester");
		empdetails.ename(empdetails.name);
		empdetails.eage(empdetails.age);
		empdetails.edesignation(empdetails.designation);
		empdetails.elocation();
		empdetails.esal();		
	}

	@Override
	public void ename(String name) {
		System.out.println("Name of the Employee: "+name);
		
	}

	@Override
	public void eage(int age) {
		System.out.println("Age of an Employee: "+age);
		
	}

	@Override
	public void edesignation(String designation) {
		System.out.println("Designation of the Employee: "+designation);
	}
	
	@Override
	public void esal() {
		System.out.println("Employee takes home is 90000.00");
			
	}

}
