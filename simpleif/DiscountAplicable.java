package com.kn.simpleif;

import java.util.Scanner;

public class DiscountAplicable {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("eneter the price");
	int price=scanner.nextInt();
	boolean discount=discountapplicable(price);
	scanner.close();
if(discount) {
	System.out.println("discount applicable");
}else {
	System.out.println("discount not applicable");
}
	}

	private static boolean discountapplicable(int price) {
		
		return price>100;
	}

}
