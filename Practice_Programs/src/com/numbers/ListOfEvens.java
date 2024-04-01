package com.numbers;

import java.util.ArrayList;

public class ListOfEvens {

	public static void main(String[] args) {
		//int array[] =new int[8];
		int array[]= {2,5,6,7,90,70,67};
		 ArrayList a=new ArrayList();
		 ArrayList b=new ArrayList();
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				a.add(array[i]);
			
			}else {
				b.add(array[i]);
				
			}
			
		}
		System.out.println("list of even numbers: "+a);
		System.out.println("list of odd numbers: "+b);
	}

}
