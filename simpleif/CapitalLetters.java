package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetters {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the letter");
	char a=scanner.next().charAt(0);
	capitalletter(a);
	scanner.close();

	}

	private static void capitalletter(char a) {
	if(a>='A' && a<='Z') {
		System.out.println("its uppercase");
		
	}else {
		System.out.println("its not uppercase");
	}

	}

}
