package StringBuffer;

public class StringBuilderClass {
	
	public static void main(String args[]) {
		
		StringBuilder sbuild = new StringBuilder("Test");
		
		sbuild.append("StringBuilder");
		System.out.println(sbuild);		
		System.out.println(sbuild.charAt(0));
		
		sbuild.delete(0, 5);		
		System.out.println(sbuild);
		
		sbuild.deleteCharAt(7);		
		System.out.println(sbuild);
		
		sbuild.insert(0, "T");		
		System.out.println(sbuild);
		
		sbuild.insert(0, "Test");		
		System.out.println(sbuild);
		
		int i = sbuild.indexOf("Test", 0);
		System.out.println(i);
		
		sbuild.reverse();
		System.out.println(sbuild);
		
		char ch[] = new char[10];
		sbuild.getChars(0, 10, ch, 0);
		System.out.println(ch);
		
		sbuild.replace(0, 4, "Test");
		System.out.println(sbuild);
	}
}
