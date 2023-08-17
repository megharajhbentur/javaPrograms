package com.kn.arrayTasks;

import java.util.Scanner;

public class SumofElementsInmethod {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	int[] arr;
	System.out.println("eneter the elements arr");
	arr=new int[scanner.nextInt()];
	
	
	for(int i=0;i<arr.length;i++) {
		System.out.println("enter the number for arr");
		arr[i]=scanner.nextInt();
		
	}
	
	 System.out.println(sumOfElements(arr));
	
	}

	private static int sumOfElements(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		 sum=sum+arr[i];
		}
		return sum;
	}

}
