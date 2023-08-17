package com.kn.arrays;

import java.util.Scanner;

public class MergeArrayElements {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size for arr");
		int[] arr=new int[scanner.nextInt()];
		System.out.println("enter the size for brr");
		int[] brr=new int[scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("eneter the number for arr");
			arr[i]=scanner.nextInt();
			}
		for(int i=0;i<brr.length;i++) {
			System.out.println("eneter the number for brr");
			brr[i]=scanner.nextInt();
			}
		
		for(int i:arr) {
			System.out.println("elements of arr : "+i+" ");
		}
		for(int i:brr) {
			System.out.println("elements of brr : "+i+" ");
		}
		int[] crr=mergeNumber(arr,brr);
		for(int i : crr) {
			System.out.println("elements of merge of crr="+i);
		}
		
	}

	private static int[] mergeNumber(int[] arr, int[] brr) {
		int[] crr=new int[arr.length+brr.length];
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i];
		}int j=0;
			for(int i=arr.length;i<crr.length;i++) {
					crr[i]=brr[j];
					j++;
			
		}
		
		return crr;
	}

}
