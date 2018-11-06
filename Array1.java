package javaPrac;

import java.util.Arrays;

public class Array1 {
//Not efficient
	public static void main(String[] args) {
		int arr1[] = {3,2,9,6,5};
		int arr2[] = {11,2,2,8};
		int count = 0;
		int loc3 = 0;
		int loc4 = 0;

		for(int i=0;i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++) {
			
			if(arr1[i]==arr2[j]) {
				
				int loc = i;
				int loc1 = j;
				System.out.println(loc);
				System.out.println(loc1);
				for(int k=loc; k<arr1.length-1; k++) {
				
					arr1[k]=arr1[k+1];
					 loc3 = k;
				}
				System.out.println("loc3 is "+loc3);
			    for(int l=loc1;l<arr2.length-1; l++) {
				arr2[l]=arr2[l+1];
				loc4 = l;
			}
			}
			}
		}
		System.out.println("loc4 is "+loc4);
		//############Merging the array#####################################################
		int arr3[] = new int[(arr1.length-1)+(arr2.length-1)];
		
        for(int i=0;i<arr1.length-1;i++) {
			
			arr3[i] = arr1[i];
			count++;
		}
		for(int j=0;j<arr2.length-1;j++) {
			
			arr3[count++] = arr2[j];
 		}
		
		System.out.println(Arrays.toString(arr3));

	}

}
