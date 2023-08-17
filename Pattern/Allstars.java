package com.kn.Pattern;

import java.util.Scanner;

public class Allstars {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();
allstars(num);
scanner.close();
	}

	private static void allstars(int num) {
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=num;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
	}

}
