

public class Primenum {

	public static void main(String[] args) {
        int coun;
		for(int i=1;i<=50;i++) {
			coun=0;
			for(int j=1;j<=i;j++) {
			if(i%j==0) {
				coun++;
			}
			
			}
			
			if(coun==2) 
				System.out.println("prime number----"+i);
			
			
		}

		
		
		
	}
}
		
		
	



