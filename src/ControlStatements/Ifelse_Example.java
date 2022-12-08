package ControlStatements;

public class Ifelse_Example {

	public static void main(String[] args) {
		
boolean two_way_but=false, mcb=false, current=true;
		
		if(two_way_but==true && mcb==true && current==true ) {
			System.out.println("Enjoy the work whatever you're doing...");
		}
		else if(current==true&& mcb==true && two_way_but==false ) {
			System.out.println("Switch is OFF..please do it ON");
		}
		else if(current==true && mcb==false) {
			System.out.println("MCB is damaged...Replace it");
		}
		else if(current==false) {
			System.out.println("It's power failure...");
		}
		else {
			System.out.println("Your device is faulty");
		}		
	}
}
