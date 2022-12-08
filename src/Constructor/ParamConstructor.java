package Constructor;

public class ParamConstructor {

	String sname, sdesign, squal;
	int sage;
	float ssal, sincr;
	int basic=50000;
	
	
	public ParamConstructor(String name, String design, String qual, int age, float incr) {
		
		sname=name;
		sdesign=design;
		squal=qual;
		sage=age;
		sincr=incr;		
	}

	int salary() {
		
		int ssal = basic+ (int) sincr;
		return ssal;
	}
	
	void display() {
		
		System.out.println("Name of person: "+sname);
		System.out.println("Designation of person: "+sdesign);
		System.out.println("Qualification of person: "+squal);
		System.out.println("Age of person: "+sage);
		System.out.println("Salary of person: "+salary());		
	}
	
	public static void main(String[] args) {
		
		ParamConstructor pc = new ParamConstructor("Renuka","Engineer","Bachlor Degree",32,8000);
		pc.display();
		System.out.println("***********************************");
		ParamConstructor pc1 = new ParamConstructor("Sharda","Professor","Master Degree",39,12000);
		pc1.display();
		System.out.println("***********************************");
		ParamConstructor pc2 = new ParamConstructor("Sarswati","Teacher","Diploma in Edu",36,13500);
		pc2.display();
		
	}

}
