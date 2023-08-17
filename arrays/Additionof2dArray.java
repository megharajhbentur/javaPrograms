package com.kn.arrays;

import java.util.Scanner;

public class Additionof2dArray {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
//array declaration and creation
int[][] arr=new int[2][];
int[][] brr=new int[2][];
System.out.println("enter the arr elements");
arr[0]=new int[scan.nextInt()];
arr[1]=new int[scan.nextInt()];
System.out.println("enter the brr elements");
brr[0]=new int[scan.nextInt()];
brr[1]=new int[scan.nextInt()];
// array initialization
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.println("enter the number for arr");
		arr[i][j]=scan.nextInt();
		}
}
for(int i=0;i<brr.length;i++) {
	for(int j=0;j<brr[i].length;j++) {
		System.out.println("enter the number for brr");
		brr[i][j]=scan.nextInt();
		}
}
findSUMofNumbers(arr,brr);		
	}

	private static void findSUMofNumbers(int[][] arr, int[][] brr) {
		int[][] crr=new int[arr.length][arr[0].length];
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr[i].length;j++) {
				crr[i][j]=arr[i][j]+brr[i][j];
				System.out.println("sum of the two number ="+crr[i][j]);
			}
		
	}

}}
