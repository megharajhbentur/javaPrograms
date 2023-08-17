package com.kn.simpleif;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=scanner.nextInt();
		boolean flag=postivenumber(num);
		scanner.close();
		if(flag) {
			System.out.println("its is a positive number = "+num);
		}else {
			System.out.println("its not a negative number = "+num);
		}

	}

	private static boolean postivenumber(int num) {
		if(num>0) { 
			return true;
		}else {
			return false;
		}

	}

}
