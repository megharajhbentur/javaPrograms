package com.kn.arrays;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the size");
	int[] arr=new int[scanner.nextInt()];
	for(int i=0;i<arr.length;i++) {
		System.out.println("enter the elements"+(i+1)+"=");
		 arr[i]=scanner.nextInt();
	}
	evenORoddNumber(arr);

	}

	private static void evenORoddNumber(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("its even number"+arr[i]);
			}else {
				System.out.println("its odd number"+arr[i]);
			}
		}
	}

}
