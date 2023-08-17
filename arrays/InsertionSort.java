package com.kn.arrays;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size array");
		int[] arr=new int[scanner.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the array elements");
			arr[i]=scanner.nextInt();
		}
		System.out.println("before swaping the elements : ");
		for( int i:arr) {
			System.out.print(i+" ");
			
		}
		
		InsertionSortDemo insertion=new InsertionSortDemo();
		insertion.insertion(arr);
		System.out.println("after the swaping :");
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
