package Constructor;

public class EmployeeConstructor_main {

	public static void main(String[] args) {
		
		EmployeeConstructor ec = new EmployeeConstructor();
		ec.display();
		System.out.println("****************************");
		EmployeeConstructor ec1 = new EmployeeConstructor(31);
		ec1.display();
		System.out.println("****************************");
		EmployeeConstructor ec2 = new EmployeeConstructor(36, "Shiv");
		ec2.display();
		System.out.println("****************************");
		EmployeeConstructor ec3 = new EmployeeConstructor(26, "Avinash",3);
		ec3.display();
		System.out.println("****************************");
		EmployeeConstructor ec4 = new EmployeeConstructor(27, "Rekha",16,"Nanded");
		ec4.display();
		System.out.println("****************************");
		EmployeeConstructor ec5 = new EmployeeConstructor(34, "Godavari",8,"Latur","Test engineer");
		ec5.display();
		
	}

}
