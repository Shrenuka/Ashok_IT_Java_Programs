package Constructor;

public class ExampleConstructor {

	int age;
	String gender, nationality; 
	
	ExampleConstructor(int age){
		this.age=age;
	}
	ExampleConstructor(int age, String nationality){
		this.age=age;
		this.nationality=nationality;
	}
	ExampleConstructor(int age, String nationality,String gender){
		this.age=age;
		this.nationality=nationality;
		this.gender=gender;
	}
	public void chechEligibility() {
		
		if(age>=18) {
			if(nationality=="Indian") {
				System.out.println("You are eligible for voting...");
			}else {
				System.out.println("You are not eligible since, your nationality is not Indian...");
			}
		}
		else {
			System.out.println("You are not eligible since, you are not fulfiling age criteria...");
		}		
	}
	public static void main(String[] args) {
		ExampleConstructor vote1 = new ExampleConstructor(12);
		vote1.chechEligibility();
		ExampleConstructor vote2 = new ExampleConstructor(32,"American");
		vote2.chechEligibility();
		ExampleConstructor vote3 = new ExampleConstructor(32, "Indian","F");
		vote3.chechEligibility();
		
	}

}
