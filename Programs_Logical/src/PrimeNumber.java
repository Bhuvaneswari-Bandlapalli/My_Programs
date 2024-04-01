
public class PrimeNumber {

	public static void main(String[] args) {
		int num=-20;
		int count=0;
		if(num>0) {
		for(int i=1;i<=9;i++) {
			if(num%i==0) {
				count=count+1;
				//System.out.println(i);
			}
				
		}
		}
		
		if(count==2) {
			System.out.println("prime number");
		}else {
			System.out.println("not a prime number");
		}
		

	
	}
	}


