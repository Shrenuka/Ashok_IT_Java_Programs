package StringBuffer;

public class StringBuff {

	public static void main(String[] args) {
		
		StringBuffer sbuff = new StringBuffer("Test");
		
		sbuff.append("StringBuffer");
		System.out.println(sbuff);		
		System.out.println(sbuff.charAt(0));
		
		sbuff.delete(0, 5);		
		System.out.println(sbuff);
		
		sbuff.deleteCharAt(7);
		System.out.println(sbuff);
		
		sbuff.insert(0, "T");
		System.out.println(sbuff);
		
		sbuff.insert(0, "Test");
		System.out.println(sbuff);
		
		int i = sbuff.indexOf("Test", 0);
		System.out.println(i);
		
		sbuff.reverse();
		System.out.println(sbuff);
		
		char ch[] = new char[10];
		sbuff.getChars(0, 10, ch, 0);
		System.out.println(ch);
		
		sbuff.replace(0, 4, "Test");
		System.out.println(sbuff);
	}

}
