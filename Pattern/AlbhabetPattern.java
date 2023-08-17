package com.kn.Pattern;

import java.util.Scanner;

public class AlbhabetPattern {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter the element");
int num=scanner.nextInt();
scanner.close();
for(int i=1;i<=num;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print((char)(64+i));
	}
	System.out.println();
	
}

	}

}
