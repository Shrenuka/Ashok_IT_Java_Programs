package String;

public class SeparateNumSplCharFromString {

	static String alphabets="", numerics="", splchars="";
	
	public static void main(String[] args) {
		
		String s = "1R@5$6%#3E^5&*N8U%9$&2^K@!1A";
		char ch[]=s.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			
			if(Character.isAlphabetic(ch[i])) {
				alphabets=alphabets+ch[i];
			
			}else if(Character.isDigit(ch[i])) {
				numerics=numerics+ch[i];
			
			}else 
				splchars=splchars+ch[i];			
		}		
		System.out.println("Numerics in given string are: "+numerics);
		System.out.println("Alphabets in given string are: "+alphabets);
		System.out.println("Special chars in given string are: "+splchars);
	}

}
