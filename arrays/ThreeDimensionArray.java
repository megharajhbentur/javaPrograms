package com.kn.arrays;

import java.util.Scanner;

public class ThreeDimensionArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//array declaration and creation
		int[][][] arr;
		arr=new int[2][2][2];
		//array initialization
		System.out.println("enter the data");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k]=scanner.nextInt();
				}
			}
		}
		//array traversing
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}
		
	}

}
