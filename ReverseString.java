package javaPrac;

public class ReverseString {

	public static void main(String[] args) {

		String str = "sumit kumar is a boy jai ho re nitin";
		String str1 = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			str1 = str1 + str.charAt(i);
		}
		System.out.println(str1);
   
	}

}
