package javaPrac;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Replace {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your string");
		String org = s.nextLine();
		System.out.println("Enter word to you want to replace");
		String replace = s.nextLine();
		System.out.println("Now enter word to you want to replace with");
		String replaceWith = s.nextLine();
		 String[] split = org.split("[^A-Za-z]+");//[^A-Za-z]+ ----> tells that remove anything other than A-za-z in string . +--> one or more than one of that i.e A-Za-z
		 System.out.println(Arrays.toString(split));
		 
		 for(int i=0; i<split.length; i++) {
			 if(split[i].contains(replace)) {
				 
				 split[i]=replaceWith;
			 }
		}
		 for(String a : split) {
			 System.out.print(a+" ");
		}
         s.close();
	}

}
