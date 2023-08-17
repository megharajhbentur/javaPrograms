package com.kn.arrays;

import java.util.Scanner;

public class CheckNumberisFound {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//array declaration
		int[] arr;
		// array creation
		System.out.println("enter the size");
		arr=new int[scanner.nextInt()];
		// array initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("enter the elements"+(i+1)+"=");
	arr[i]=scanner.nextInt();
		}
	//entering of a number
	System.out.println("enter the number");
	int num=scanner.nextInt();
	//checking of the number
	boolean flag=isElementPresentorNot(arr,num);
	if(flag) {
		System.out.println("the element"+num+"is found");
	}else {
		System.out.println("the element"+num+"is not found");
	}
	}
// method called to check the number
	private static boolean isElementPresentorNot(int[] arr, int num) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==num) {
			return true;
		}
	}
		return false;
	}

}
