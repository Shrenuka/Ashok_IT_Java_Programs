package polymorphism_Overloading;

public class ConstructorOverloading {

	String name;
	String designation;
	int age;
	String location;
	
	public ConstructorOverloading() {
		System.out.println("Default constructor");
	}
	public ConstructorOverloading(String name) {
		this.name=name;
		System.out.println("Name: "+name);
	}
	public ConstructorOverloading(String name, String designation) {
		this.name=name;
		this.designation=designation;
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
	}
	public ConstructorOverloading(String name, String designation, int age) {
		this.age=age;
		this.name=name;
		this.designation=designation;
		System.out.println("Name: "+name);
		System.out.println("Desigantion: "+designation);
		System.out.println("Age: "+age);
	}
	public ConstructorOverloading(String name, String designation, int age, String location){
		this.age=age;
		this.name=name;
		this.location=location;
		this.designation=designation;
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
		System.out.println("Age: "+age);
		System.out.println("Location: "+location);
	}
		
	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading();
		System.out.println("********************");
		ConstructorOverloading co1 = new ConstructorOverloading("Jimmy");
		System.out.println("********************");
		ConstructorOverloading co2 = new ConstructorOverloading("Khimmy","Painter");
		System.out.println("********************");
		ConstructorOverloading co3 = new ConstructorOverloading("Simmy","Dancer",28);
		System.out.println("********************");
		ConstructorOverloading co4 = new ConstructorOverloading("Gimmy","Businessman",53,"Darjaling");
		
		
	}

}
