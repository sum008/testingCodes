package javaPrac;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		//More efficient deleting same element
		int arr1[] = {3,2,9,6,4};
		int arr2[] = {11,2,8,4};
		int arr3[] = new int[(arr1.length-1)+(arr2.length-1)];
		int k=0;
		int count = 0;
		for(int i =0; i<arr1.length;i++) {
			
			for(int j=0;j<arr2.length;j++) {
				
				if(arr1[i]==arr2[j]) {
					count =1;
				}
			}
			   if(count==0) {
				arr3[k]=arr1[i];
				k=k+1;
		}
			   count=0;
			   }
	
		
		System.out.println(Arrays.toString(arr3));
		
	}

}
