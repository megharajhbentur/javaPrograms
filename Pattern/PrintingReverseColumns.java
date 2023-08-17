package com.kn.Pattern;

import java.util.Scanner;

public class PrintingReverseColumns {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();
		for(int i=num;i>=1;i--) {
			for(int j=num;j>=1;j--) {
				System.out.print(j);
			}System.out.println();
		}

	}

}
