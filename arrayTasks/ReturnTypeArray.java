package com.kn.arrayTasks;

import java.util.Scanner;

public class ReturnTypeArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	int[][][] arr;
	System.out.println("eneter the elements i");
	int size1=scanner.nextInt();
	System.out.println("eneter the elements j");
	int size2=scanner.nextInt();
	System.out.println("eneter the elements k");
	int size3=scanner.nextInt();
	arr=new int[size1][size2][size3];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("eneter the element for arr");
				arr[i][j][k]=scanner.nextInt();
				
			}
		}
	}
	int[][][] crr=(returnValue(arr)); 
	System.out.println("elements of brr");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println(crr[i][j][k]);
			}
		}}
	}

	private static int[][][] returnValue(int[][][] arr) {
	int[][][] brr=new int[arr.length][arr[0].length][arr[0][0].length];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			for(int k=0;k<arr[i][j].length;k++) {
				brr[i][j][k]=arr[i][j][k]; 
			}
		}
	}
	return brr;
			}
		
	}


