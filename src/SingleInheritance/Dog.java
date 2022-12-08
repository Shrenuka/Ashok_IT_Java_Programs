package SingleInheritance;

public class Dog extends Animal{

	String color;
	static float hight;
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		d.name="Bagga";
		d.breed="loga";
		
		System.out.println(d.breed);
		System.out.println(d.name);
		
		System.out.println((hight=2.5f) + "feet");					
		System.out.println(d.color="Black");
		
		d.eat();
		d.bark();
	}
	public void bark() {
		System.out.println("Barking....");
	}

}
