package com.kn.arrayTasks;

import java.util.Scanner;

public class BackwordArrayUsingMethod {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int [] arr;
		System.out.println("eneter the number of elements for arr");
		arr=new int[scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the arr elements");
			arr[i]=scanner.nextInt();
			
			}
		int[] crr=reversenumber(arr);
		for(int i=crr.length-1;i>=0;i--) {
			System.out.println("reverse of arr ="+crr[i]);
		}

	}

	private static int[] reversenumber(int[] arr) {
		int[] brr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			
			brr[i]=arr[i];
		}
		return brr;
	}

	

}
