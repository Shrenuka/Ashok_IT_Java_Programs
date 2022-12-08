package HierarchicalInheritance;

public class Teacher extends Person{

	String college;
	int emp_id;
	
	Teacher(String name, String profession, String college, int st_id) {
		super(name, profession);
		this.college=college;
		this.emp_id=st_id;
	}

	public static void main(String[] args) {
		Teacher t = new Teacher("Renuka", "Teacher","MITCollege",213);
		t.teacherDetails();
	}

	public void teacherDetails() {
		System.out.println("Name of the person: "+name);
		System.out.println("Profession of the Person: "+profession);
		System.out.println("Name of college: "+college);
		System.out.println("Id of the person: "+emp_id);
	}
}
