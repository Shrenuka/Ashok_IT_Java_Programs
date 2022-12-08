package abstraction;


public class SupportTeam extends ITDept{

	public SupportTeam(String name, int age, String designation) {
		super(name, age, designation);
	}

	public static void main(String args[]) {
		SupportTeam support = new SupportTeam("Shivaji",36, "Support Engineer");
		support.ename(support.name);
		support.edesignation(support.designation);
		support.elocation();
		support.empticket();
		support.esal();
	}

	@Override
	public void ename(String name) {
		System.out.println("Name of the Employee: "+name);
		
	}

	@Override
	public void edesignation(String designation) {
		System.out.println("Designation of the Employee: "+designation);
	}
	
	public void empticket() {
		System.out.println("Employee is facing issue with network");
	
	}
	
	public void esal() {
		System.out.println("Employee takes home is 87455.00");
	}
	
	
}
