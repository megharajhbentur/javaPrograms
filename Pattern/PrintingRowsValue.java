package com.kn.Pattern;

import java.util.Scanner;

public class PrintingRowsValue {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		  int num=scanner.nextInt();
		  rowsvalue(num);
		  scanner.close();
	}

	private static void rowsvalue(int num) {
		for(int i=1;num>=i;i++) {
			for(int j=1;num>=j;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
