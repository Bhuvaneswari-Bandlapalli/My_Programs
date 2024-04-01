package com.patterns;

public class pyramidPattern {
	public static void main890(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
public static void main89(String[] args) {
	//pyramid with numbers
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print("  ");
			
		}for(int k=1;k<=i;k++) {
			System.out.print(k+" ");
			
		}
		System.out.println();
	}
	
}
public static void main4(String[] args) {
	//half pyramid
	int n=3;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
public static void main09(String[] args) {
	//reverse  pyramid
    int n=5;
    for(int i=n;i>=1;i--) {
    	for(int j=1;j<=n-i;j++) {
    		//System.out.print(" ");
    		System.out.print("  ");//reverse half piramid
    	}
    	for(int k=1;k<i;k++) {
    		System.out.print("* ");
    	}
    	System.out.println();
    }
	
}
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
			
		}for(int k=1;k<=i;k++) {
			System.out.print((k)+" ");
			
		}
		System.out.println();
	}
	
}
public static void main12(String[] args) {
	 int n = 6; // Change this value to adjust the number of rows

     for (int i = 0; i < n; i++) {
         int number = 1;
         for (int j = 0; j <= i; j++) {
             System.out.print(number + " ");
             number = number * (i - j) / (j + 1);
         }
         System.out.println();
     }
 }
public static void main56(String[] args) {
	int n=7;
	for(int i=1;i<=n;i++) {
		int num=1;
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(num+" ");
			num=num*(i-k)/(k+1);
		}
		System.out.println();
	}
}
}
