package javaPrac;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		pattern1();
		System.out.println();
		pattern2();
		System.out.println();
		pattern3();
		System.out.println();
		pattern4();
		System.out.println();
		pattern6();
		System.out.println();
		pattern5();
		System.out.println();
		pattern7();
		System.out.println();
		pattern8();
	}
	    public static void pattern1() {
		int loc = 0;
        for(int i=0; i<=5; i++){
            
            for(int j=0;j<=i;j++){
                
                
                System.out.print(j+1);
            }
                for(int k =loc+1;k<=5; k++){
                System.out.print("*");
               }
                  loc=loc+1;
                System.out.println();
        }
}
	    public static void pattern2() {
	    	int loc = 0;
	    	for(int i=0; i<5;i++) {
	    		
	    		for(int j=0; j<5-i; j++) {
	    			
	    			System.out.print(j+1);
	    			loc = j;
	    		}
	    		for(int k=loc; k<5;k++) {
	    			
	    			System.out.print("*");
	    		}
	    		System.out.println();
	    	}
	    }
	    
	    public static void pattern3() {
	    	
	    	int count = 0;
	    	System.out.println("@");
	    	System.out.println("@ @");
	    	
	    	for(int i=0; i<=5; i++) {
	    		
	    			if(i>1&&i<5) {
	    				count=1;
	    				System.out.print("@");
	    				for(int j=0; j<=i; j++) {
	    				
	    				System.out.print(" ");
	    			}
	    				System.out.print("@");
	    			}
	    			if(count==1) {
	    			System.out.println();
	    			}
	    			count = 0;
	    			 if(i==5) {
	    				System.out.println("@ @ @ @ @");
	    			}
	    		}
	    	}
	    
	    public static void pattern4() {
	    	
	    	for(int i=0;  i<10; i++) {
	    	  
	    		System.out.println((i+1) +"    "+ (10-i) + "    "+ (i+11)+"    "+(20-i)+ "    "+(i+21)+"    "+(30-i));
	       }	
	    }
	    
	    public static void pattern5() {
	    	int n=6;
	    	int count = 0;
	    	int count1=0;
	    	for(int i=0; i<n; i++) {
	    		
	    		for(int j=0; j<n-i; j++) {
	    			
	    			System.out.print(" ");
	    			count = j;
	    		}
	    		for(int k=count; k<n; k++) {
	    			System.out.print("*");
	    			
	    		}
	    		for(int m=n; m<(n+i); m++) {
	    				System.out.print("*");
	    			}
	    		System.out.println();
	    	}
	    		//############-----MERGING PATTERN5 & PATTERN6 TO GET A TRIANGLE--------##############
	    		
	    		for(int p=0; p<n; p++) {
		    		for(int j=0; j<=p; j++) {
		    			System.out.print(" ");
		    			count1=j;
		    		}
		    		for(int k=count1; k<n; k++) {
		    			System.out.print("#");
		    		}
		    		
		    		for(int x=n+1; x<(2*n-p); x++) {
		    		System.out.print("@");
		    		}
		    		System.out.println();
		    	}
	    }
	    
	    
	    public static void pattern6() {  //ONLY DOWN FACING TRIANGLE
	    	int count1=0;
	    	int n=6;
	    	for(int i=0; i<n; i++) {
	    		for(int j=0; j<=i; j++) {
	    			System.out.print(" ");
	    			count1=j;
	    		}
	    		for(int k=count1; k<n; k++) {
	    			System.out.print("#");
	    		}
	    		
	    		for(int x=n+1; x<(2*n-i); x++) {
	    		System.out.print("@");
	    		}
	    		System.out.println();
	    	}
	    }
	    
	    public static void pattern7() {
	    	
	    	int count = 0;
	    	System.out.println("      #");
	    	for(int i=0; i<6; i++) {
	    		
	    		for(int j=0; j<6-i; j++) {
	    			
	    			System.out.print(" ");
	    			count = j;
	    		}
	    		System.out.print("#");
	    		//System.out.println("count is"+count);
	    		for(int k=count+1; k<=10-count; k++) {
	    			System.out.print(" ");
	    		}
	    		System.out.print("#");
	    		System.out.println();
	    		
	    	}
	    	for(int x=0;x<=6;x++) {
	    		System.out.print("# ");
	    	}
	    }
	    
	    public static void pattern8() {
	    	
	    	Scanner s = new Scanner(System.in);
	    	System.out.println("Enter length");
	    	int l = s.nextInt();
	    	System.out.println("Enter breadth");
	    	int b = s.nextInt();
	    	
	    	for(int i=0; i<l; i++) {
	    		for(int j=0; j<b; j++) {
	    			System.out.print(" "+(j+i+1));
	    		}
	    		System.out.println();
	    	}
	    }
	    }
	    
	


