package com.kn.arrays;

import java.util.Scanner;

public class ThreeDJaggedArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//array declaration
		int[][][] arr;
		int[][][] brr;
		arr=new int[2][][];
		brr=new int[2][][];
		//array creation
		System.out.println("enter the elements for arr[0]");
		arr[0]=new int[scanner.nextInt()][scanner.nextInt()];
		System.out.println("enter the elements for arr[1]");
		arr[1]=new int[scanner.nextInt()][scanner.nextInt()];
		System.out.println("enter the elements for brr[0]");
		brr[0]=new int[scanner.nextInt()][scanner.nextInt()];
		System.out.println("enter the elements for brr[1]");
		brr[1]=new int[scanner.nextInt()][scanner.nextInt()];
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
				}}
		
		
		
}
}
