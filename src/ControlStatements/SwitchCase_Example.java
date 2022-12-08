package ControlStatements;

public class SwitchCase_Example {

	public static void main(String[] args) {
		
		String s="Dec";
		
		switch (s) {
		case "Jan": {
			System.out.println("Its first month of year");break;
		}
		
		case "Feb":{
			System.out.println("Its second month of year");break;
		}
		
		case "Mar":{
			System.out.println("Its third month of year");break;
		}
		
		case "Apr": {
			System.out.println("Its fourth month of year");break;	
		}
		
		case "May":{
			System.out.println("Its fifth month of year");break;
		}
		
		case "Jun":{
			System.out.println("Its sixth month of year");break;
		}
		
		case "Jul":{
			System.out.println("Its seventh month of year");break;
		}
		
		case "Aug":{
			System.out.println("Its eighth month of year");break;
		}
		
		case "Sep":{
			System.out.println("Its nineth month of year");break;
		}
		
		case "Oct":{
			System.out.println("Its tenth month of year");break;
		}
		
		case "Nov":{
			System.out.println("Its eleventh month of year");break;
		}
		
		case "Dec": {
			System.out.println("Its twelveth month of year");break;
		}	
		
		default :{
			System.out.println("Invalid month of year");
		}
		}		
	}
}
