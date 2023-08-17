package com.kn.arrays;

import java.util.Scanner;

public class BinarySearchOfTheElement {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	// array declaration and creation
	System.out.println("eneter the size of the element");
	int[] arr=new int[scanner.nextInt()];
	for(int i=0;i<arr.length;i++) {
		System.out.println("eneter the elemnts of arr");
		arr[i]=scanner.nextInt();
	}
	//array traversing
	System.out.println("elements of arr");
	for(int i:arr) {
		System.out.print(i+" ");
	}
		System.out.println();
		System.out.println(" eneter the element to be found");
         int ele=scanner.nextInt();
         binarySearchofElement(arr,ele);

	}
//  method to find elements
	private static void binarySearchofElement(int[] arr, int ele) {
	      int postion=-1;
	      int low=0;
	      int high=arr.length-1;
	      boolean isFound=false;
	      while(low<=high) {
	    	 int mid=(low+high)/2;
	    	 if(ele==arr[mid]) {
	    		 isFound=true;
	    		 postion=mid+1;
	    		 break;
	    	 }else
	    		 if(ele>arr[mid]) {
	    			 low=mid+1;
	    			 high=high;
	    			 
	    		 }else
	    		 {
	    			 high=mid-1;
	    			low=low;
	    		 }
	    	 
	      }
	      if(isFound==false) {
	    	  System.out.println("not found");
	    	  
	      }else {
	    	  System.out.println("element found "+ele+" at "+postion);
	      }
	      
	      
		
	}

}
