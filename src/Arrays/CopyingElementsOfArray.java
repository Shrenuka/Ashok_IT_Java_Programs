package Arrays;

public class CopyingElementsOfArray {

	public static void main(String[] args) {
		
		int a[]= {2,4,5,6,2,3,8,6,9,1};
		int b[]= new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		
		for(int aa:a) { //For printing an array
			System.out.print(aa+" ");
		}		
		System.out.println();
		System.out.println("**************************");
		for(int bb:b) {
			System.out.print(bb+" ");
		}
	}

}
