package collectionframework;

import java.util.ArrayList;

public class ArrayList_String {

	public static void main(String[] args) {
		
		ArrayList renu = new ArrayList();
		
		renu.add(12);
		renu.add("Renuka");
		renu.add(12.123);
		
		System.out.println(renu);
		
		ArrayList<String> str = new ArrayList();
		str.add("String");
		str.add(1,"Manager");
		str.add(2,"Engineer");		
		str.add(3,"QA");
		
		str.add(0,"Developer"); //This will pushing values
		
		System.out.println(str);
		
	}

}
