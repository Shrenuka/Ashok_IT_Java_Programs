package Looping;

public class Pattern_example1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 11; i++) {
			
			while(i==6) {
				
				for(int j=5; j>=0; j--) {
					
					System.out.print("* ");
					
				}
				break;
			}
			System.out.println("*");
		}		
	}
}
