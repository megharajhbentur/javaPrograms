package com.kn.arrays;

import java.util.Scanner;

public class TwoDJaggerElements {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// array declaration and creation
	int[][] arr=new int[2][];
	System.out.println("enter the elements of base 0");
	arr[0]=new int[scanner.nextInt()];
	System.out.println("enter the elements of base 1");
	arr[1]=new int[scanner.nextInt()];
	// array initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println(" enter the base"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(" enter the number");
			arr[i][j]=scanner.nextInt();
		}
		
	}
	// array traversing
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("array number");
			System.out.println(arr[i][j]);
		}
	}
	

	}

}
