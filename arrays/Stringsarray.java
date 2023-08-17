package com.kn.arrays;

import java.util.Scanner;

public class Stringsarray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//array declaration
		String[] str;
		//array creation
		System.out.println("enter the size");
		//int size=scanner.nextInt();
		str=new String[scanner.nextInt()];
		//array initialization
		for(int i=0;i<str.length;i++) {
			System.out.println("enter the data for element"+(i+1)+"=");
			str[i]=scanner.next();
		}
		for(int i=0;i>str.length;i++) {
			System.out.println(str[i]);
		}
		
		

	}

}
