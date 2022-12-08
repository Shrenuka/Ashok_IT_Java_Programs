package Arrays;

public class FindMinmaxValue {

	public static void main(String[] args) {		
		
		int arr[]= {21,29,18,56,38,47,73,124,9,1045};		
		
		int len=arr.length;
		
		int min=arr[0];
		for(int i=1; i<len; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Minimum value in array is: "+min);
		
		int max=arr[0];
		for(int j=1; j<len; j++) {
			if(max<arr[j]) {
				max=arr[j];
			}
		}
		System.out.println("Maximum value in array is: "+max);
	}

}
