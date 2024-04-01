package com.patterns;

public class perfectNumbers {
	public static void main(String[] args) {
		for(int i=10;i<=99;i++) {
			if(isperfect(i)) {
				System.out.println(i + " is perfect");
			}
		}
	}
	public static boolean isperfect(int num) {
		int sumofdiv=1;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				sumofdiv=sumofdiv+i;
			}
		}
		
		return sumofdiv==num;
	}

}
