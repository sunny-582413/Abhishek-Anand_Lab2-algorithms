package com.lab1;

import java.util.Scanner;

import com.lab1.model.PayMoney;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array: ");
		int size = sc.nextInt();

		int[] transactions = new int[size];

		System.out.println("Enter the values of array: ");

		for (int i = 0; i < size; i++) {
			transactions[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved: ");
		int targetSize = sc.nextInt();

		while (targetSize > 0) {
			System.out.println("Enter the value of target: ");
			int target = sc.nextInt();

			int result = PayMoney.countRequiredTransactions(transactions, size, target);

			if (result == -1) {
				System.out.println("The target is not achieved");
				break;
			}

			System.out.printf("Target achieved after %d transactions\n\n", result);
		}

		sc.close();

	}

}
