package HierarchicalInheritance;

public class Student extends Person{
	
	String college;
	int st_id;
	
	Student(String name, String profession, String college, int st_id) {
		super(name, profession);
		this.college=college;
		this.st_id=st_id;		
	}
	
	public static void main(String args[]) {
		Student s = new Student("Shiv","Student","MIT",332);
		s.studentDetails();
	}
	
	public void studentDetails() {
		System.out.println("Name of the person: "+name);
		System.out.println("Profession of the Person: "+profession);
		System.out.println("Name of college: "+college);
		System.out.println("Id of the person: "+st_id);
	}

}
