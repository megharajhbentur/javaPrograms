package com.kn.Pattern;

import java.util.Scanner;

public class Printingcolumnsvalue {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number");
int num=scanner.nextInt();
printcolumns(num);
scanner.close();
	}

	private static void printcolumns(int num) {
	for(int i=1;num>=i;i++) {
		for(int j=1;num>=j;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
		
	}

}
