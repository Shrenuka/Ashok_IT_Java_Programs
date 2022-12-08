package Arrays;

public class TwoDimArray {
	
	public static void main(String[] args) {
	
		//Method 1
		int a[][]=new int [3][3];
		
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		a[2][0]=70;
		a[2][1]=80;
		a[2][2]=90;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("********************");
		
		//Method 2
		int b[][]= {{12,34,24},{54,37,61},{43,76,83}};
		
		for(int x=0; x<3; x++) {
			for(int y=0; y<3; y++) {
				System.out.print(b[x][y]+" ");
			}
			System.out.println("");
		}
		
	}

}
