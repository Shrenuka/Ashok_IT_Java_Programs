package String;

public class StringAreImmutable {

	public static void main(String[] args) {
		
		String s1 = "Renuka";
		
		String s2 = s1;
		
		s1 = "Mrs. Wankhede";
		
		System.out.println(s1+" "+s2);
		
		System.out.println("**************");
		
		s1.concat(s2);
		System.out.println(s1);
		
		System.out.println("**************");
				
		s1=s1.concat(" "+s2);
		System.out.println(s1);
		
		System.out.println("**************");
		
		int val = 64;
		float ff = 55.44f;
		String s3 = "Shivaji";
		
		//s3 = s3.concat(value+ff); //error--> we should add "" before adding different data types
		s3 = s3.concat(""+val+ff);
		System.out.println(s3);
		
		System.out.println("**************");
		
		System.out.println(s2+val+ff);
		
		System.out.println("**************");
		
		String s4 = s3.toString();
		System.out.println(s4);
		
		System.out.println("**************");
		
		s4 = (""+val).toString();
		System.out.println(s4);
		
	}

}
