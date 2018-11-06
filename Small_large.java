package javaPrac;

public class Small_large {

	public static void main(String[] args) {
		
		int arr[] = {2,6,1,8,9,0,10,18,21};
		int secondSmall = 0;
		int small = arr[0];
		int secondLarg = 0;
		int larg = arr[0];
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<small) {
				secondSmall=small;
				small=arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>larg) {
				secondLarg=larg;
				larg=arr[i];
			}
		}
		
		System.out.println("Second smallest is :"+secondSmall);
		System.out.println("Smallest is :"+small);
		System.out.println("Second largest is :"+secondLarg);
		System.out.println("Largest is :"+larg);

	}

}
