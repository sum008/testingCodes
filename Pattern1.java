package javaPrac;

public class Pattern1 {

	public static void main(String[] args) {
		pattern();
		pattern1();
		pattern2();
		pattern3();
		fibonacciSeries();
		palindrome();
		}
	
	public static void pattern() {
		int x=0;
		int a=13;
		int t=0;
		
		for(int i=1; i<=4; i++) {
			
			if(i%2==0) {
				t=a;
                for(int j=1; j<4; j++) {
					
					System.out.print(a++ + "*");
					
				}
				System.out.println(a);
				a=t-4;
			}
			else {
				
				x=a;
				for(int j=1; j<4; j++) {
					
					System.out.print(a++ + "*");
					
				}
				System.out.println(a);
				a=x-4;
			}
		}
		System.out.println("######################################################################################");

	}
	
	public static void pattern1() {
		
		int a=1;
		int x=0;
		int y=0;
		for(int i=1; i<=4; i++) {
			
			if(i%2==0 && i!=4) {
                  for(int j=1; j<4; j++) {
					
					System.out.print(x++ + "*");
				}
				System.out.println(x++);
				a=x;
				
			}else if(i%2!=2 && i!=4){
				for(int j=1; j<4; j++) {
					
					System.out.print(a++ + "*");
				}
				System.out.println(a++);
				x=4+a;
			}else {
				
				for(int j=1; j<4; j++) {
					System.out.print((j+4) +"*");
					 y = j+5;
				}
				System.out.println(y);
			}
		}
		System.out.println("######################################################################################");

	}
	
	public static void pattern2() {
		
		int a=1;
		int x=0,y=0;
		int t=0;
		for(int i=1; i<=5; i++) {
			
			if(i%2==0 && i!=4) {
                 for(int j=1; j<4; j++) {
					
					System.out.print(x++ + "*");
				}
				System.out.println(x++);
				a=x+4;
				t=x;
			}else if(i==1 || i==3) {
				
				for(int j=1; j<4; j++) {
					
					System.out.print(a++ + "*");
				}
				System.out.println(a++);
				x=a+4;
				
			} else if(i==4){
				
                  for(int j=1; j<4; j++) {
					
					System.out.print(t++ + "*");
				}
			}else if(i==5) {
				System.out.println(t);
                    for(int j=1; j<4; j++) {
					
					System.out.print((j+4) + "*");
					y=j+5;
				}
				System.out.println(y);
			}
		}
		System.out.println("######################################################################################");

	}
	
	public static void pattern3() {
		int z=0;
		int s=0;
		int n=4;
		int x=n;
		int a=0;
		int b=0;
		for(int i=1; i<=n; i++) {
			
				for(int j=1; j<i; j++) {
					System.out.print(" ");
					b=j;
				}
				
			 for(int k=b;k<n; k++) {
					
					System.out.print(++z +"*");
				}
				
				for(int m=1 ;m<=n-i; m++) {
					
					System.out.print((x*x+ ++a) + "*");
				}
				s=x*x+ ++a;
				x=x-1;
				System.out.println(s);
			}
		System.out.println("######################################################################################");

		}
	
	public static void fibonacciSeries() {
		int x=1;
		int y=1;
		int z=0;
		int n=20;
		
		System.out.print(y);
		for(int i=0; i<=n; i++) {
			z=y;    //Storing previous value of y(i.e.. x) in z i.e..y is previous x
			y=x;    //Storing current value of x in y
			System.out.print(","+x);
			x=y+z;   //current value of x using previous x and previous of previous x
		}
		System.out.println();
		System.out.println("######################################################################################");

	}
	
	public static void palindrome() {
		
		int x =1234567;
		int y=0;
		String a = Integer.toString(x);
		String b = "abcde";
		//if you want to print integer...just replace b with a in all places...we can also use switch case here to print integer or string
		for(int i=0; i<=(b.length()+b.length()-1); i++) {
			
			if(i<b.length()) {
			System.out.print(b.charAt(i));
			y=i;
			}
			else if(i>=(b.length()+1)) {
				y=y-1;
				System.out.print(b.charAt(y));
				
			}
		}
		System.out.println();
		System.out.println("######################################################################################");

	}
	

	}

