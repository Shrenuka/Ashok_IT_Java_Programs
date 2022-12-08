package String;

public class Example {
	
	public static void main(String[] args) {
		
		String str = "Sarswati";
		
		int len=str.length();
		
		System.out.println(len);
		
		String str1 = "Prathmesh";
		
		String str3 = "Sarswati";	 
		
		if(str3==str) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if(str3.equals(str)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if(str1==str) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if(str1.equals(str)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
