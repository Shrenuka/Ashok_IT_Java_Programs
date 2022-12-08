package Constructor;

//import Constructor.ParamConstructor;

public class DefaultConstructor {
	
	static String sname= "Sambhaji";
	static String squal= "B.Sc.";
	static int sage=36;
	static String scity="Naigaon";
	//static String sdesign="Peon";
	//static float sincr = 800f;
	
	void display() {
		System.out.println("Name of person: "+ sname);
		System.out.println("Qualification of person: "+squal);
		System.out.println("Age of person: "+sage);
		System.out.println("City from whitch person belongs: "+scity);
	}
	

	public static void main(String[] args) {
		
		DefaultConstructor dc = new DefaultConstructor();
		//dc.sname="Shivaji";
		dc.display();
		//DefaultConstructor dc1 = new DefaultConstructor();
		//dc1.display();
		//ParamConstructor pc = new ParamConstructor(sname,squal,sdesign,sage,sincr);
		//pc.display();
	}
}
