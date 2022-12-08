package Looping;

//import java.util.Scanner;

public class Factorial_example {

	public static void main(String args[]) {
		
		//Factorial example--5!=5*4*3*2*1= 120
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt(); */
		
		int num=10, i, k=1;
		long j=1; 
		for(i=num; i>=1; i--) {
			j = j * i * k;			
		}
		System.out.println("Factorial of "+num+"! is: "+j);
	}
}
