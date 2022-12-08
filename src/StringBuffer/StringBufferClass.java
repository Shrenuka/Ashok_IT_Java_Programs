package StringBuffer;

public class StringBufferClass {

	public static void main(String args[]) {
		
		StringBuffer sbuff = new StringBuffer("Ashok");
		
		sbuff.append("IT");
		System.out.println(sbuff);
		
		sbuff.append("Test");
		System.out.println(sbuff);
		
		StringBuffer sbuff1 = new StringBuffer();
		
		sbuff1=sbuff;
		System.out.println(sbuff);
		System.out.println(sbuff1);
		
		sbuff1.append("AnotherTest");
		System.out.println(sbuff1);
		
		sbuff.append("TestAnother");
		System.out.println(sbuff);
		System.out.println(sbuff1);
		
	}
	
}
