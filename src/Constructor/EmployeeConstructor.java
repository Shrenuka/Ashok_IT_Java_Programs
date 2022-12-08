package Constructor;

public class EmployeeConstructor {

	int age, id;
	String name, location, post;
	
	EmployeeConstructor(){
		System.out.println("Default constuctor");
	}
	EmployeeConstructor(int age){
		this.age=age;
		System.out.println("one param constructor");
	}
	EmployeeConstructor(int age, String name){
		this.age=age;
		this.name=name;
		System.out.println("two param constructor");
	}
	EmployeeConstructor(int age, String name, int id){
		this.age=age;
		this.name=name;
		this.id=id;
		System.out.println("three param constructor");
	}
	EmployeeConstructor(int age, String name, int id, String location){
		this.age=age;
		this.name=name;
		this.id=id;
		this.location=location;
		System.out.println("four param constructor");
	}
	EmployeeConstructor(int age, String name, int id, String location, String post){
		this.age=age;
		this.name=name;
		this.id=id;
		this.location=location;
		this.post=post;
		System.out.println("five param constructor");
	}
	public void display() {
		System.out.println("Name of employee: "+name);
		System.out.println("Id of employee: "+id);
		System.out.println("Age of employee: "+age);
		System.out.println("Location of employee: "+location);
		System.out.println("Post of employee: "+post);
	}
}
