package String;

public class ReplaceSpecificCharInString {

	public static void main(String[] args) {
		
		String s="My name is Renuka Shinde";
		char ch[]=s.toCharArray();
		System.out.println(ch.length);
		
		char replaceChar='n';
		char replaceWith='*';
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]==replaceChar) {
				s=s.replace(replaceChar, replaceWith);
			}
		}
		System.out.println(s);
	}

}
