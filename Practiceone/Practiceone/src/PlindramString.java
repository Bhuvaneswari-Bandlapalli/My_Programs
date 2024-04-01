import java.util.Scanner;

public class PlindramString {
	
	public static void mains(String args[])  
	   {  
	      String str, reverse = "";  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter number ");  
	      str = in.nextLine();   
	      int length = str.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + str.charAt(i);  
	      if (str.equals(reverse))  
	         System.out.println("Entered number is a palindrome.");  
	      else  
	         System.out.println("Entered number isn't a palindrome.");   
	   } 
	
	public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n=2145; 
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  
	 


