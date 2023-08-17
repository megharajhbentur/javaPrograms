package com.kn.arrays;

import java.util.Scanner;

public class AvrageOFTwoArray {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	//array declaration and creation
	System.out.println("eneter the size of arr");
	int[] arr=new int[scanner.nextInt()];
	System.out.println("enter the size of brr");
	int[] brr=new int[scanner.nextInt()];
	System.out.println("enter the arr elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scanner.nextInt();
		}
	System.out.println("enter the brr elements");
	for(int i=0;i<brr.length;i++) {
		brr[i]=scanner.nextInt();
		}
	scanner.close();
	
     averageOFArray(arr,brr);
   
	}
// method to find average of 2d array
	private static void averageOFArray(int[] arr, int[] brr) {
	int crr[]=new int[arr.length+brr.length];
	for(int i=0;i<arr.length;i++) {
		crr[i]=arr[i];
	}   int j=0;
		for(int i=arr.length;i<crr.length;i++) {
			crr[i]=brr[j];
			j++;
		}
		// 2d array traversing
		System.out.println("avaerge of the 2 d array");
		for(int i:crr) {
			System.out.print(i+" ");
	}
		// sum of elements
		int sum=0;
for(int i=0;i<crr.length;i++) {
			sum=sum+crr[i];
			
		}sum=sum/crr.length;
		System.out.println();
		System.out.println("avaerage of the elements ="+sum);
	}
		
	}


