package Constructor;

public class Math_Cal_withconstructor {

	Math_Cal_withconstructor(){  //Constructor
		
		int x = 0,y = 0;
		sum( x,  y);
		sub(x, y);
		mul(x, y);
		
	}
	public int sum(int x, int y) {
		int sum=x+y;
		return sum;
	}
	public int sub(int x, int y) {
		int sub=x-y;
		return sub;
	}
	public int mul(int x, int y) {
		int mul=x*y;
		return mul;
	}	
	
	

}
