package com.kn.arrays;

import java.util.Scanner;

public class Intarray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//array declaration
		int[] arr;
		//array creation
		System.out.println("enter the size");
		arr=new int[scanner.nextInt()];
		//array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the number"+(i+1)+"=");
			arr[i]=scanner.nextInt();
		}
		for(int i=1;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
