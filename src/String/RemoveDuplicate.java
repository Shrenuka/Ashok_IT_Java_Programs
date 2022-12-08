package String;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String s = "Jan Gan Man Gan Jan Aan Gan Jan Man Man Kan Gan Man Jan Kan";
		
		String spl[] = s.split(" ");
		
		System.out.println(spl.length);
			
		for(int i=0; i<spl.length; i++) {
			for(int j=i+1; j<spl.length; j++) {
				if(spl[i].equals(spl[j])) {
					spl[j]="";
				}				
			}
			if(spl[i]!="")
			System.out.print(spl[i]+" ");
		}		
	}
}
