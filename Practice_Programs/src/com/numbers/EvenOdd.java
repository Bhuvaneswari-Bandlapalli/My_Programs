package com.numbers;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer: ");
		int k=sc.nextInt();
		if(k%2==0) {
			System.out.println(k+" is even Number.");
		}else {
			System.out.println(k+" is Odd number.");
		}
		
	}

}
