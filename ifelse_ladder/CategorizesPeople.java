package com.kn.ifelse_ladder;

import java.util.Scanner;

public class CategorizesPeople {

	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("enter the age");
	 int age=scanner.nextInt();
	categorize(age);
	scanner.close();

	}

	private static void categorize(int age) {
		if(age>=0 && age<=12) {
			System.out.println(" its child age");
		}else if(age>=13 && age<=19) {
			System.out.println(" its teen age");
		}else if(age>=20 && age<=59) {
			System.out.println("its adult age");
		}else {
			System.out.println("its senior age");
		}
	
	}

}
