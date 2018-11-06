package javaPrac;

public class StringCompare {

	public static void main(String[] args) {//LAST WORD OF STRING IN ARRAY MUST APPERAR AT FIRST POSITION IN ANOTHER STRING IN ARRAY AND VICE VERSA
		
		String arr[] = {"ijk", "abcd","fghi","def"};
		
		for(int i=0; i<arr.length; i++) {
			
			String a = arr[i];
			System.out.println(a);
			
			for(int j=i+1; j<arr.length; j++) {
				
				String b = arr[j];
				System.out.println(b);
				System.out.println();
				 if(a.charAt(a.length()-1)==b.charAt(0)||a.charAt(0)==b.charAt(b.length()-1)) {
					 
					 System.out.println("True");
					 break;
				 }else {
					 System.out.println("flase");
				 }
				
				
				}
			
			          
		}                 
		
				}

}
