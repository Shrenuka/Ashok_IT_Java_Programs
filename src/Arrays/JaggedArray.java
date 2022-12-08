package Arrays;

public class JaggedArray {
	
	public static void main(String[] args) {
		
		int a[][]= {{4,6,3,4,9},{2,3,7,5,9,1},{2,7,9,4,6,2,3,8}};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
