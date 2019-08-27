package javaPrac;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test2 { //Removing duplicate characters from string

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//String str1;
		System.out.println("Enter your string");
        String str1=s.nextLine();
		int i;
		//System.out.println("Enter your string");
       // str1=s.nextLine();

		System.out.println("Enter case");
		int ch = s.nextInt();
		
		Set<Character> store = new HashSet<Character>();
		Set<String> store1 = new HashSet<String>();
		
		switch(ch) {
		
		case 1 : 
		         System.out.println(str1.length());
			
		       	 for(i=0;i<str1.length();i++) {
			
			          if(store.add(str1.charAt(i))==false) {
				//System.out.print(str1.charAt(i));
		        }
			      else {
				System.out.print("cfbfbf"+str1.charAt(i));
			    }
		} break;
		
		case 2 :  String str2[]= {"sumit","kumar","sumit","ajay","vinay","jarvis"}; 
			      for(String str : str2) {
			
			      if(store1.add(str)==false) {
				System.out.print(str);
		       }
			   else {
				//System.out.print(str1.charAt(i));
			    }
		  }
		
		break;
		
		}
		
		
		/*for(i=0;i<str1.length();i++) {
			
			if(store.add(str1.charAt(i))==false) {
				//System.out.print(str1.charAt(i));
		    }
			else {
				//System.out.print(str1.charAt(i));
			}
		}*/
		s.close();
       }

}
