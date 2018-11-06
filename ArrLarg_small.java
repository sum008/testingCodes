package javaPrac;

import java.util.Arrays;

public class ArrLarg_small {

	public static void main(String[] args) {
		
		int arr1[] = {108,6,4,19,45,12,82,68,2,0,99};
		int temp=0;
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=i+1; j<arr1.length; j++) {
				
				if(arr1[i]>arr1[j]) {
					
					temp = arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
			    }
			}
		}
		System.out.println("Sorted array is : "+Arrays.toString(arr1));
		System.out.println("smallest number in array is : "+ arr1[0]);
	   System.out.println("largest number in array is : "+ arr1[arr1.length-1]);
		

	}

}
