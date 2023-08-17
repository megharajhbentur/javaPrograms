package com.kn.ifelse_ladder;

import java.util.Scanner;

public class PostiveNegativeZero {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();
		checknumber(num);
		scanner.close();

	}

	private static void  checknumber(int num) {
		if(num>0) {
			System.out.println(" its a poative number");
		}else if(num==0) {
			System.out.println("its a zero");
		}else {
			System.out.println("its a negative");
		}
		
	}

}
