package com.kn.arrays;

public class InsertionSortDemo {
	int[] insertion(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int j=1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp ) {
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=temp;
		}
		return arr;
		
		
		
	}
	

}
