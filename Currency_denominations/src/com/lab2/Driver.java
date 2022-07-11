package com.lab2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations: ");
		int numberOfDenominations = sc.nextInt();

		int[] currencyDenominations = new int[numberOfDenominations];

		System.out.println("Enter the currency denominations value: ");
		for (int i = 0; i < numberOfDenominations; i++) {
			currencyDenominations[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay: ");
		int targetAmount = sc.nextInt();
		
		CurrencyDenominations currency = new CurrencyDenominations(currencyDenominations, numberOfDenominations);
		MergeSort.sort(currency.currencyDenominations, 0, numberOfDenominations-1);
		
		NotesCount.numberOfDenominations(currency.currencyDenominations, targetAmount);
		sc.close();

	}

}
