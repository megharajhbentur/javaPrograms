package com.kn.simpleif;

import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int age=scanner.nextInt();
		boolean adult=adult(age);
		scanner.close();
		if(adult) {
			System.out.println("he is a adult");
		}else
		{
			System.out.println("he is not a adult");
		}
		

	}

	private static boolean adult(int age) {
	if(age>18) {
		return true;
	}
		return false;
	}


}
