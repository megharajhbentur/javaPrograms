package com.kn.arrayTasks;

import java.util.Scanner;

public class SumOfTwoDArray {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("eneter the elements for arr");
	int[] arr=new int[scanner.nextInt()];
	System.out.println("eneter the elements for brr");
	int[] brr=new int[scanner.nextInt()];
	for(int i=0;i<arr.length;i++) {
		System.out.println("enter the number for  arr ");
		arr[i]=scanner.nextInt();
		}
	for(int i=0;i<brr.length;i++) {
		System.out.println("enter the number for  brr ");
		brr[i]=scanner.nextInt();
		}
	int[] crr=sumOFTwodArray(arr,brr);
	for(int i=0;i<crr.length;i++) {
		System.out.println("sum of the elements"+crr[i]);
	}
	

	}

	private static int[] sumOFTwodArray(int[] arr, int[] brr) {
		int[] crr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i]+brr[i];
		}
		return crr;
	}

}
