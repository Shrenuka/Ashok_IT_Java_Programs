package Arrays;

public class SortingAnArray {

	public static void main(String[] args) {
		
		int a[]= {21,65,45,37,82,91,97,31,18,19,49,33};
		int temp;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int aa:a) {
			System.out.print(aa+" ");
		}
	}
}
