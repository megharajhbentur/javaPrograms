package com.kn.arrays;

public class Initialiazation {

	public static void main(String[] args) {
	int[] arr;
	arr=new int[5];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	for(int i=0;i<=arr.length-1;i++) 
	//for(int i=arr.length-1;i>=0;i--)
		{
		System.out.println(arr[i]);
	}
	}

}
