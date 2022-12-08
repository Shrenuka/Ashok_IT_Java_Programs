package Arrays;

public class CopyingTwoArrayInSingleArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,7,6,4,5,8};
		int b[]= {4,5,6,2,9};
		int c[]=new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++) {
			c[i]=a[i];
		}
		
		for(int j=0; j<b.length; j++) {
			c[j+a.length]=b[j];
		}
		
		for(int cc:c) {
			System.out.print(cc+" ");
		}
	}

}
