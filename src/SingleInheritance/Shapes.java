package SingleInheritance;

public class Shapes {

	float length, breadth, area;
	
	public void display() {
		System.out.println("This is rectangle");
	}	
	
	public float area() {
		
		area = length * breadth;
		return area;
	}	
}
