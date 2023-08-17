package com.kn.arrays;

import java.util.Scanner;

public class MaximumNumberandMinimunNumber {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("eneter the size");
	int[] arr=new int[scanner.nextInt()];
	System.out.println("eneter the elements for arr");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scanner.nextInt();
	}
	maximumAndMinmum(arr);
	

	}

	private static void maximumAndMinmum(int[] arr) {
		int max1=-2147483648;
		int min=2147483647;
		int max2=max1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max1=arr[i];		
				}
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]<max1) {
				max2=arr[i];
			}
			
		}System.out.println(" maximun ="+max1);
		System.out.println("minimum ="+min);
		System.out.println("2 max ="+max2);
		
	}

}
