package com.kn.arrays;

import java.util.Scanner;

public class TwoDimensionalString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// array declaration and creation
	String[][] arr=new String[4][];
	System.out.println("enter the A1 batches number of friends");
	arr[0]=new String[scanner.nextInt()];
	System.out.println("enter the A2 batches number of friends");
	arr[1]=new String[scanner.nextInt()];
	System.out.println("enter the A3 batches number of friends");
	arr[2]=new String[scanner.nextInt()];
	System.out.println("enter the A4 batches number of friends");
	arr[3]=new String[scanner.nextInt()];
	// array initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("the batch A"+(i+1)+"the number of friends"+arr[i].length);
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter the friends name :"+arr[j].length);
			arr[i][j]=scanner.next();
		}
	}
	scanner.close();
	// array traversing
	for(int i=0;i<arr.length;i++) {
		System.out.println("the batch A"+(i+1)+"the number of friends :"+arr[i].length);
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(arr[i][j]);		
	}
	}
	}
}
