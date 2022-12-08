package String;

public class CountDuplicates {

	public static void main(String[] args) {
		
		String s = "sa re ga ma sa re ga ma da pa ja pa da re ga ha pa sa ma ma ma ga pa ";
		String spl[]=s.split(" "); //here in (" ") space is necessary, with space length=23, without space length=69
		System.out.println("Length of string with spaces: "+spl.length);
		System.out.println();
		
		for(int i=0; i<spl.length; i++) {
			int count=0;
			for(int j=i+1; j<spl.length; j++) {
				if(spl[i].equals(spl[j])) {
					count++;
					spl[j]="";
				}
			}
			if(count>0 && spl[i]!="") {
				System.out.println(spl[i]+" repeated "+count+" times.");
			}		
		}		
	}
}
