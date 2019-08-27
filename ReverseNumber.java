package javaPrac;

public class ReverseNumber {

	public static void main(String[] args) {

		long num = 1234560789;
	    String a = Long.toString(num);
	    String b ="";
	    for(int i=a.length()-1;i>=0;i--) {
	    	
	    	b = b+a.charAt(i);
	    }
	    //System.out.println(b);
	   Long c = Long.parseLong(b);
	   System.out.println(c);
	}

}
