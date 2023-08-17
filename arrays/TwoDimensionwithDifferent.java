package com.kn.arrays;

public class TwoDimensionwithDifferent {

	public static void main(String[] args) {
		// array declaration and creation
		int [][] arr=new int[2][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		//array initialization
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[0][3]=40;
		arr[1][0]=50;
		arr[1][1]=60;
			System.out.println("****************************************");
		//array traversing
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
	
	}

}
