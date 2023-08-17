package com.kn.arrayTasks;

public class EvenorOddAndCountTheArrayDemo {
 void EvenorOddAndCountTheArray(int[] arr){
	for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		 System.out.println("this is even number ="+arr[i]);
	 }else {
		 System.out.println("this is odd number ="+arr[i]);
	 }
	}

}
void countEvenOrOdd(int[] arr) {
	int evencount=0;
	int oddcount=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			evencount++;
		}else {
			oddcount++;
		}
		
	}System.out.println("even count numbers="+evencount);
	System.out.println("odd count numbers="+oddcount);
}


}
