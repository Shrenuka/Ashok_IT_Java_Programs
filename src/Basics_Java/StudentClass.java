package Basics_Java;

public class StudentClass {
	
	static String college = "MIT";
	String sname;
	int sid;

	public static void main(String[] args) {
		
		StudentClass sclass = new StudentClass();
		sclass.sname = "Amit";
		sclass.sid = 01;
		System.out.println("Name of Student: "+sclass.sname);
		System.out.println("Id of Student: "+sclass.sid);
		System.out.println("College of Student: "+college);
		
		StudentClass sclass1 = new StudentClass();
		sclass1.sname = "Atul";
		sclass1.sid = 02;
		System.out.println("Name of Student: "+sclass1.sname);
		System.out.println("Id of Student: "+sclass1.sid);
		System.out.println("College of Student: "+college);
		
		StudentClass sclass2 = new StudentClass();
		sclass2.sname = "Abhay";
		sclass2.sid = 03;
		System.out.println("Name of Student: "+sclass2.sname);
		System.out.println("Id of Student: "+sclass2.sid);
		System.out.println("College of Student: "+college);
		
		StudentClass sclass3 = new StudentClass();
		sclass3.sname = "Ashok";
		sclass3.sid = 04;
		System.out.println("Name of Student: "+sclass3.sname);
		System.out.println("Id of Student: "+sclass3.sid);
		System.out.println("College of Student: "+college);
		
		StudentClass sclass4 = new StudentClass();
		sclass4.sname = "Ajay";
		sclass4.sid = 05;
		System.out.println("Name of Student: "+sclass4.sname);
		System.out.println("Id of Student: "+sclass4.sid);
		System.out.println("College of Student: "+college);

	}

}
