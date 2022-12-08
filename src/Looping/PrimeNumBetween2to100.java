package Looping;

public class PrimeNumBetween2to100 {

	public static void main(String[] args) {
		
		//Program to find prime numbers between 2 to 100
		
		int count=0, i;
		for(i=2; i<=100; i++) {
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					count++;					
				}
			}
			if(count==2) {
				System.out.print(i+", ");				
			}
			count=0;
		}
		System.out.println(" ");	
		System.out.println("These are prime numbers from 2 to 100 ");	
	}

}
