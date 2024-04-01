package com.numbers;

public class ArmstrongNumber {

	public static void main1(String[] args) {
		int num=153;
		int i=num;
		int rev,remainder=0,j;
		while(i!=0) {
			rev=i%10;
		remainder=remainder+rev*rev*rev;
			i=i/10;
		}
		System.out.println(remainder);
		

	}
	public static void main(String[] args) {
		int num=153;
		int i=num;
		int rev,remainder=0,j;
	    String s=Integer.toString(num);
	 //  int k=  Integer.parseInt(s);
	    int len=s.length();
	    while(i>0) {
	    	rev=i%10;
	    	//remainder=remainder+rev*rev*rev;
	    	remainder=(int) (remainder+Math.pow(rev, len));
	    	i=i/10;
	    	
	    	
	    }
	    System.out.println(remainder);
	    if(num==remainder) {
	    	System.out.println("armStri=ong number");
	    }
	    else {
	    	System.out.println("not armStrong number");
	    }
	   
	}

}
