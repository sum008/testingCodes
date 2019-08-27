package javaPrac;

public class Alphabet {

	public static void main(String[] args) {
		alphabetA();
		System.out.println();
		alphabetB();
		
	}
		
		public static void alphabetA() {
		int x=0;
		for(int i=0; i<=5; i++) {
			
			for(int j=0;j<=(5-i); j++) {
				
				System.out.print(" ");
				x=j;
			}
			System.out.print("A");
			if((x+2)==4) {
				for(int k=x+2; k<=6+i; k++) {
					
					System.out.print("A");
				}
			}else
			for(int k=x+2; k<=6+i; k++) {
				
				System.out.print(" ");
			}
			System.out.print("A");
			System.out.println();
		}
		}
		public static void alphabetB() {
			
		for(int i=0; i<6; i++) {
                if((i==1)||(i==2)) {
				
                	for(int m=i; m<i+1; m++) {
                		System.out.print("B");
                	}
                	
				for(int j=1; j<(9+i); j++) {
					System.out.print(" ");
				}}
				else if((i==3)||(i==4)) {
					
					for(int m=i; m<i+1; m++) {
                		System.out.print("B");
                	}
                	
				for(int j=1; j<14-i; j++) {
					System.out.print(" ");
				}
				
				}
			else if((i==0)){
				
				for(int m=i; m<i+1; m++) {
            		System.out.print("B");
            	}
			for(int j=0; j<8; j++) {
				System.out.print("B");
				
			}}
			else if((i==5)) {
				for(int m=i; m<i+1; m++) {
            		System.out.print("B");
            	}
			for(int j=0; j<8; j++) {
				System.out.print("B");
				
			}
			}
			System.out.print("B");
			
			System.out.println();
			
		}
		for(int i=0; i<5; i++) {
            if((i==0)||(i==1)) {
			
            	for(int m=i; m<i+1; m++) {
            		System.out.print("B");
            	}
            	
			for(int j=1; j<(9+i); j++) {
				System.out.print(" ");
			}}
			else if((i==2)||(i==3)) {
				
				for(int m=i; m<i+1; m++) {
            		System.out.print("B");
            	}
            	
			for(int j=1; j<12-i; j++) {
				System.out.print(" ");
			}
			}
		
            else if((i==4)) {
				for(int m=i; m<i+1; m++) {
            		System.out.print("B");
            	}
			for(int j=0; j<7; j++) {
				System.out.print("B");
				
			}
			}
		System.out.print("B");
		
		System.out.println();
	
	}

	}
	}


