package com.programs.arrays;


public class CommonElementsInTwoArrays {

	public static void main1(String[] args) {
		//int array1[]=new int[9];
		
		int array1[]= {1,2,3,4,56,78,90};
		int array2[]= {2,5,6,78,90,1,54};
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					
					System.out.print(array1[i]+",");
				}
			}
		}

	}
	public static void main(String[]args) {
		String array_1[]= {"bhuvana","rukmini","navya","deepthi"};
		String[] array_2= {"rukmini","chinna","navya"};
			for(int i=0;i<array_1.length;i++) {
				for(int j=0;j<array_2.length;j++) {
					if(array_1[i].equals(array_2[j])) {
						System.out.println(array_1[i]+" ");
					}
				}
			}
	}

}
