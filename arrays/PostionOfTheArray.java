package com.kn.arrays;

import java.util.Scanner;

public class PostionOfTheArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("eneter the size ");
		int[] arr=new int[scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("eneter the number for arr");
			arr[i]=scanner.nextInt();
		}
			System.out.println("give the number to be searched");
			int num=scanner.nextInt();			
		int res=postionOfTheElements(arr,num); 
		if(res>0) {
			System.out.println("number is found "+res);
		}else {
			System.out.println("not found");
		}
	}

	private static int postionOfTheElements(int[] arr,int num) {
		//boolean isfound=false;
		int postion=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
			//	isfound=true;
				postion= ++i;
				return postion;
				//break;
				
		
			}
			
		}
		//if(isfound=true) {
		//	return postion;
//	}else {
		//	return -1;
	//	}
		return -1;
		
		

}
}
