package String;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Shivaji";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		System.out.println("**********************");
		
		String str1 = "Renuka";
		char ch[] = str1.toCharArray();
		for(int j=ch.length-1; j>=0; j--) {
			System.out.print(ch[j]);
		}
		System.out.println("");
		System.out.println("***********************");
		
		String num = "1234321";
		String rev="";		
		for(int k=num.length()-1; k>=0; k--) {
				rev=rev+num.charAt(k);
		}
		if(rev.equals(num)) {
			System.out.println(num+" is palindrome");
		}else {
			System.out.println(num+" is not palindrome");
		}
		
	}

}
