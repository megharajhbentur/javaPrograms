package com.kn.arrays;

import java.util.Scanner;

public class TwoDimensionwithTwoBase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//array declaration and creation
		System.out.println("enter the element of arr");
		int [] arr=new int[scanner.nextInt()];
		System.out.println("enter the elements of brr");
		int [] brr=new int [scanner.nextInt()];
		//array initialization
		System.out.println("enter the numbers for arr");
		for(int i=0;i<arr.length;i++) {
				arr[i]=scanner.nextInt();
			}
		System.out.println("eneter the numbers for brr");
		for(int j=0;j<brr.length;j++) {
				brr[j]=scanner.nextInt();
			}
		crr(arr,brr);
		
	}
//method to calculate
	private static void crr(int[] arr, int[] brr) {
		int[] crr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<brr.length;j++){
						 crr[i]=arr[i]+brr[j];
						System.out.println("the sum of the number  = "+crr[i]);
						
				
			}
		}
		
	}

}
