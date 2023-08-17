package com.kn.ifelse_ladder;

import java.util.Scanner;

public class StudentGrading {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
	int marks=scanner.nextInt();
	scanner.close();
	
	System.out.println(grade(marks));

	}

	 static String grade(int marks) {
		String result="";
		if(marks>=90 && marks<=100) {
			 result="A Grade";
			 // System.out.println("A Grade");
		}else if(marks>=80 && marks<=89) {
			result="B Grade";
			//System.out.println("B Grade");
		}else if(marks>=70 && marks<=79) {
			result="C Grade";
			//System.out.println("C Grade");
		}else if(marks>=60 && marks<=69) {
			result="D Grade";
			//System.out.println("D Grade");
		}else {
			result="F Grade";//System.out.println(" F Grade");
		}
		return result;
	}

}
