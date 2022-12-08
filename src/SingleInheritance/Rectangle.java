package SingleInheritance;

public class Rectangle extends Shapes {

	float circumference;
	
	public static void main(String[] args) {
		
		Rectangle rc = new Rectangle();
		rc.length=34.5f;
		rc.breadth=12.5f;
		rc.display();
		System.out.println("Area of Rectangle is: "+rc.area());
		System.out.println("Circumference of Rectangle is: "+rc.circumference());		
	}
	
	public float circumference() {		
		circumference = 2 * (length + breadth);
		return circumference;
	}
}
