package Arrays;

public class MultiDimArray {

	public static void main(String[] args) {
		
		int a[][][] = {{{5,7,2,9},{2,8},{8,5,4}}}; //[]={} //[][]={{}}  //[][][]={{{}}}		
		
		for(int i=0; i<a.length; i++) { //array=1
			
			for(int j=0; j<a[i].length; j++) {	//rows=3		
				for(int k=0; k<a[i][j].length; k++) {	//columns=4			
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println(" ");	
			}			
		}			
	}
}
