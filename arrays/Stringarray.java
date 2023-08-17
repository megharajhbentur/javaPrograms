package com.kn.arrays;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	//Array Declaration
     double[] arr;
	//Array creation
	System.out.println("enter the size of the element");
	int size=scanner.nextInt();
    arr=new double[size];
	
	//Array initialization
    int k=10;
	for(int i=0;i<arr.length;i++) {
		arr[i]=k;
		k=k+10;
	}
	//Array Traversing
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}

}
