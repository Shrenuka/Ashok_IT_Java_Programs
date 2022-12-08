package Looping;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		//Program to find given number is prime or not
		
		int count=0;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if(num!=0) {
			for(int j=1; j<=num; j++) {
				if(num % j == 0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(num+" is prime number");
			}else 
				System.out.println(num+" is not prime number");	
			
		}		
	}
}
