package abstraction;

public abstract class Employee {

	String name;
	static int age=10;
	String designation;
	String location;
		
	public Employee(String name, int age, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.designation = designation;
	}
	
	public abstract void ename(String name);
	public abstract void eage(int age);
	public abstract void edesignation(String designation);
	public abstract void esal();
	
	public void elocation()
	{
		System.out.println("Emplyee works in Hyderabad location");
		test();
	}
	
    public final static void test()
	{
		System.out.println("Emplyee posted to Hi-Tech");
	}
	

}
