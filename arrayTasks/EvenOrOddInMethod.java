package com.kn.arrayTasks;

import java.util.Scanner;

public class EvenOrOddInMethod {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of elements");
		int[] arr=new int [scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the numbers for arr");
			arr[i]=scanner.nextInt();
		}
      evenORoddElements(arr);
	}

	private static void evenORoddElements(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("even number  = "+arr[i]);
			}else {
				System.out.println("odd number   = "+arr[i]);
			}
		}
	}

}
