package com.kn.arrays;

import java.util.Scanner;

public class SelectionSorting {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("eneter the size");
		int[] arr=new int[scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("eneter the elements");
			arr[i]=scanner.nextInt();
		}
		System.out.print("before sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		//for(int i=0;i<arr.length;i++) {
			//int min=arr[i];
			//int index=i;
			//for(int j=i+1;j<arr.length;j++) {
				//if(min<arr[j] ){
					//min=arr[j];
					//index=j;
			//	}
				//}
		//	int temp=arr[i];
			//arr[i]=arr[index];
			//arr[index]=temp;
			//}System.out.println("after the swaping");
			//for(int i:arr) {
			//	System.out.print(i+" ");
			//}
		SelectionSortingDemo sorting=new SelectionSortingDemo();
		sorting.selectionSorting(arr);
		System.out.println();
		System.out.println("after sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		}
	
	}

