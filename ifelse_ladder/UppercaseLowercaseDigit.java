package com.kn.ifelse_ladder;

import java.util.Scanner;

public class UppercaseLowercaseDigit {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("eneter the number");
		char a=scanner.next().charAt(0);
		character(a);
		scanner.close();
	}

	private static void character(char a) {
		if(a=='A'|| a=='E'|| a=='I'|| a=='O'||a=='U') {
			System.out.println("its a upper case vowels");
		}else if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
			System.out.println("its a lower case vowels");
		}else if(a>='A' && 'Z'>=a ) {
			System.out.println("its a uppercase Consonant");
		}else if(a>='a' && 'z'>=a ) {
			System.out.println("its a lowercase Consonant");
		}
		else if(a>=0  && 9<=a) {
			System.out.println("its a digit");
		}else {
			System.out.println("its special character");
		}
		
	}

}
