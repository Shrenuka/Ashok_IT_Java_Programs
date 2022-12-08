
package ControlStatements;

public class NestedIfelse_Example {

	public static void main(String[] args) {
		
		int wheels=4, cc=1000;		
		
		if(wheels==4) {
			
			System.out.println("Vehival is four wheeler");
			
			if(cc>=500 && cc<=800) {
				System.out.println("Its Maruti-800");
			}else {
				System.out.println("Its other than Maruti-800");
			}
			
		}else if(wheels>4){
			
			System.out.println("Vehical is commercial vehical");
			
			if(cc>=800 && cc<=1200) {
				System.out.println("Vehical can bear heavy loads");
			}
			else{
				System.out.println("Vehical can not bear heavy loads");
			}
		}
		else {
			System.out.println("Vehical is not suitable to run on highway...");
		}		
	}
}
