import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size ");
		int[] arr=new int[scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("eneter the elements for arr");
			arr[i]=scanner.nextInt();
		}
		System.out.println("before swaping arr elements : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}		
		SortingArraydemo sortingOfTheElement=new SortingArraydemo();
		sortingOfTheElement.sortingOfTheElement(arr);
		System.out.println();
		System.out.println("print the sorted elements : ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
	//private static void sortingOfTheElement(int[] arr) {
		//for(int i=0;i<arr.length;i++) {
			//for(int j=0;j<arr.length-i-1;j++) {
			//	int temp=0;
			 //if(arr[j]>arr[j+1]) {
				// temp=arr[j];
				 //arr[j]=arr[j+1];
				 //arr[j+1]=temp;
			 //}
			
		//	}
			
	//	}
		//System.out.println();
		//System.out.println("print the sorted elements : ")
		//;for(int i : arr) {
			//System.out.print(i+" ");
		//}
		
	//}

//}
