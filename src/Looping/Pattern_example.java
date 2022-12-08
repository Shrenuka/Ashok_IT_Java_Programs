package Looping;

public class Pattern_example {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("*************************");
		//Method 1
		for(int k=5; k>=0; k--) {
			for(int l=k; l>=0; l--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("*************************");
		//Method 2
		for(int x=0; x<=5; x++) {
			for(int y=5; y>=x; y--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
