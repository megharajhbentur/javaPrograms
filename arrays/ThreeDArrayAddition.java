package com.kn.arrays;

import java.util.Scanner;

public class ThreeDArrayAddition {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	// array declaration
	int[][][] arr;
	int[][][] brr;
	System.out.println("eneter the elements of  i");
	int size1=scanner.nextInt();
	System.out.println("eneter the elements of  j");
	int size2=scanner.nextInt();
	System.out.println("eneter the elements of  k");
	int size3=scanner.nextInt();
	
	// array creation
	arr=new int[size1][size2][size3];
	brr=new int[size1][size2][size3];
	//array initialization
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			for(int k=0;k<arr[i][j].length;k++ ) {
				System.out.println("eneter the elements for arr");
				arr[i][j][k]=scanner.nextInt();			}
		}
	}
	for(int i=0;i<brr.length;i++) {
		for(int j=0;j<brr[i].length;j++) {
			for(int k=0;k<brr[i][j].length;k++ ) {
				System.out.println("eneter the elements for brr");
				brr[i][j][k]=scanner.nextInt();			}
		}
	}
	additionOfTHENumber(arr,brr);
	}

	private static void additionOfTHENumber(int[][][] arr, int[][][] brr) {
		int [][][] crr;
		crr=new int[arr.length][arr[0].length][arr[0][0].length];
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr[i].length;j++) {
				for(int k=0;k<crr[i][j].length;k++ ) {
					crr[i][j][k]=arr[i][j][k]+brr[i][j][k];
					
					System.out.println("sum of the numbers  ="+crr[i][j][k]);
				}
			}}}
		
	}


