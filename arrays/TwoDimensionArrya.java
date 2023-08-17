package com.kn.arrays;

import java.util.Scanner;

public class TwoDimensionArrya {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//array declaration
		int[][] arr;
		// array creation
		System.out.println("enter the students=");
		int size1=scanner.nextInt();
		System.out.println("enter the subjects per student");
		int size2=scanner.nextInt();
		arr=new int[size1][size2];
		//array initialization
		for(int i=0;i<size1;i++) {
			System.out.println("enter student"+(i+1)+"data:");
			for(int j=0;j<size2;j++) {
				System.out.println("enter the subject"+(j+1)+"marks=");
				arr[i][j]=scanner.nextInt();
			}}
		// array traversing
			for(int i=0;i<arr.length;i++) {
				System.out.println("enter the student"+(i+1)+"data:");
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("enter the subject"+(j+1)+"marks="+arr[i][j]);
				
			}
		}
	}

}
