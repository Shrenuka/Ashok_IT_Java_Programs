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
		str.add("Wankhede");
		//str.add(123); //error msg as 123 is not string datatype
		
		str.add(1,"Renuka");
		str.add(2,"Engineer");
		//str.add(0,"Shiv");
		str.add(3,"QA");
		
		System.out.println(str);
		
	}

}
