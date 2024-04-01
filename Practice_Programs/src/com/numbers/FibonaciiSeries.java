package com.numbers;

import java.util.ArrayList;

public class FibonaciiSeries {

	public static void main1(String[] args) {
		int f=9;
		int k=0;
		int h=1;
		int g=1;
	
		for(int i=0;i<=9;i++) {
			System.out.println(k);
			k=h;
			h=g;
			g=k+h;
		}

	}
	public static void main4(String[] args) {
		int f=9;
		int k=0;
		int h=1;
		int g=1;
	ArrayList o=new ArrayList();
	
		for(int i=0;i<=9;i++) {
			o.add(k);
			//System.out.println(k);
			k=h;
			h=g;
			g=k+h;
		}
		System.out.println(o);
	}
	public void fibonacci(int num) {
		int k=0;
		int l=1;
		int m=1;
		ArrayList o=new ArrayList();
		for(int i=0;i<=num;i++) {
			o.add(k);
			//System.out.println(k);
			k=l;
			l=m;
			m=k+l;
			
		}
		System.out.println(o);
	}
	public static void main(String[] args) {
		FibonaciiSeries f=new FibonaciiSeries();
		f.fibonacci(10);
	}

}
