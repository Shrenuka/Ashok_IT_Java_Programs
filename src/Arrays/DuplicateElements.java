package Arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		
		int a[]= {10,30,45,25,30,40,10,25,15,15,30,40,25,35,10,15,25,35,45};	
		
		for(int i=0; i<a.length; i++) {
			int count=0;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=0;
				}
			}
			if(count>0 && a[i]!=0) {
				System.out.println(a[i]+ " repeated "+count+" times");
			}
		}
	}

}
