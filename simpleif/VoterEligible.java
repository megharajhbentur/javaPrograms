package com.kn.simpleif;

import java.util.Scanner;

public class VoterEligible {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
	int age=scanner.nextInt();
	boolean eligible=votereligible(age);
	if(eligible) {
		System.out.println("eligible to vote");
	}else {
		System.out.println("not eligible to vote");
	}

	}

	private static boolean votereligible(int age) {
	
		return age>=18;
	}

}
