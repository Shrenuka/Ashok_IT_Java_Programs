package String;

public class PrintCharsBasedOnNumeric {

	public static void main(String[] args) {
		// Program to print given chars based on following number
		
		String s = "R3E4N5U6";
		char ch[]=s.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{			
			if(Character.isDigit(ch[i])) {
				
				int val=Character.getNumericValue(ch[i]);			
				for(int j=0; j<val; j++) {
					System.out.print(ch[i-1]+" ");
				}
			}
			System.out.println();
		}
	}
}
