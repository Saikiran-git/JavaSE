package com.kiran.java.junit.Parameterized;

import java.util.Scanner;




public class RainbowJewellers {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE
		SkeletonValidator validator = new SkeletonValidator();
		// CODE SKELETON - VALIDATION ENDS

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the gold in grams");
		double grams = Double.parseDouble(scanner.nextLine());
		RainbowJewellersService rainbowJewellersService = new RainbowJewellersService();
		double totalPriceOfGold = rainbowJewellersService.calculategoldprice(grams);
		System.out.println("Total Price of the Gold is: " + totalPriceOfGold);
		scanner.close();
	}

}
