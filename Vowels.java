package javaPrac;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		String str1, str2="";
		System.out.println("Please enter your string");
		
		Scanner s = new Scanner(System.in);
		
		str1 = s.nextLine();
		
		for(int i = 0;i<str1.length();i++) {
			
			if(str1.charAt(i)=='A'||str1.charAt(i)=='a'||str1.charAt(i)=='E'||str1.charAt(i)=='e'||str1.charAt(i)=='I'
					||str1.charAt(i)=='i'||str1.charAt(i)=='O'||str1.charAt(i)=='o'||str1.charAt(i)=='U'||str1.charAt(i)=='u')
			{
				str2 = str2 + str1.charAt(i);	//To print only vowels
			}else {
				
				//str2 = str2 + str1.charAt(i); //To print only consonents
			}
			
		}

		System.out.println(str2);
		s.close();
	}

}
