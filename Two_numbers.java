package javaPrac;

import java.util.Scanner;

public class Two_numbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = s.nextInt();
		System.out.println("Enter second number which is greater than first number");
		int b = s.nextInt();
		int c=0;
		int d=1;
		
		if(a>b) {
			
			System.out.println("Not a valid input");
		}else if(a<b) {
			
			for(int x=a+1; x<b; x++) {
				
				c = c+x;
				d = d*x;
			}
		}
		System.out.println("Sum of numbers between given input is : "+ c);
		System.out.println("Product of numbers between given input is : "+ d);
		s.close();

	}

}
