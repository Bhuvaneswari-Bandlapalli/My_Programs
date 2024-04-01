import java.util.Scanner;

public class SumValue {

	public static void main (String[] args) {
	
		int num,sum;
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
		for(sum=0; num!=0; num=num/10)
		{
			sum=sum+num%10;
		}
            System.out.println("sum of digits--"+sum);
	}
   public static void mainsum(String[] args) {
	   
	   int number, digit, sum = 0;  
	   Scanner sc = new Scanner(System.in);  
	   System.out.print("Enter the number: ");  
	   number = sc.nextInt();  
	   while(number > 0)  
	   {  
	   //finds the last digit of the given number    
	   digit = number % 10;  
	   //adds last digit to the variable sum  
	   sum = sum + digit;  
	   //removes the last digit from the number  
	   number = number / 10;  
	   }  
	   //prints the result  
	   System.out.println("Sum of Digits: "+sum);  
	  
   }
  }
