package com.kn.arrayTasks;

import java.util.Scanner;

public class EvenOrOddAndCountTheArray {

	public static void main(String[] args) { 
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the elements of size");
	int[] arr= new int[scanner.nextInt()];
	for(int i=0;i<arr.length;i++) {
		System.out.println("eneter the arr elements");
		arr[i]=scanner.nextInt();
		
		}
	
	EvenorOddAndCountTheArrayDemo EvenorOddAndCountTheArray=new EvenorOddAndCountTheArrayDemo();
	EvenorOddAndCountTheArray.EvenorOddAndCountTheArray(arr);
	EvenorOddAndCountTheArray.countEvenOrOdd(arr);
	}

}
