package javaPrac;

public class Permutation {

	public static void main(String[] args) {
		
		//This approach is much direct and easy to understand. but slow
		/*int fire=0;
		int police=0;
		int sani=0;
	int police1=0;
		
		
		 for(int i=0; i<=7; i++) {
			
			for(int j=0; j<=7; j++) {
				
				for(int k=0; k<=7; k++) {
					
					if((i!=j)&&(k!=i)&&(k!=j)){
						fire=i;
						police=j;
						sani=k;
					
					if(police%2 == 0) {
						police1=police;
					}
					if((fire+police1+sani)==12) {
						
						System.out.println(+fire + "  " + police1+"  "+ sani);
						//System.out.println("Sum is :"+ (fire+police1+sani));
					}
				}
			}
		}
		 }*/
		//Another approach---->Little simple version on above code
		 for(int i=0; i<=7; i++) {
				
				for(int j=0; j<=7; j++) {
					
					for(int k=0; k<=7; k++) {
						
						if((i!=j)&&(i!=k)&&(k!=j)&&(j%2 == 0)&&(i+j+k)==12){
							
							System.out.println(i + "  " + j+"  "+ k);
						}
						}
				}
		 }
		 
		 
		 //This step is bit complex to do at single attempt. Will take time to sort it out.Problem with this code is that what if sum of i+j 
		 //becomes greater than 12, then this code will become invalid
		 
		/*for(int i=0; i<=7; i++) {
			 
			 for(int j=i+2; j<=7; j=j+2) {
				 
				 int police2 = 12-(i+j);
				 System.out.println(i +" "+police2+" "+j);
			 }
		 }*/
		
		
	}

}

