package javaPrac;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//String x = "MATHEMATICS";
		Scanner s = new Scanner(System.in);
		String arr[][] = new String[5][7];
		System.out.println("Enter ypor string");
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<7; j++) {
				
				
				arr[i][j]=s.nextLine();
			}
		}
		System.out.println("String is");
            for(int i=0; i<5; i++) {
			
			      for(int j=0; j<7; j++) {
				
				
				  System.out.print(arr[i][j]);
			}
			      System.out.println();
		}

	}

}
