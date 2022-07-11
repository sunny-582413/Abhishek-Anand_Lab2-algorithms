package com.lab1.model;

public class PayMoney {

	public static int countRequiredTransactions(int[] transaction, int size, int target) {

		int SumState = 0;

		for (int i = 0; i < size; i++) {
			SumState += transaction[i];

			if (SumState >= target) {
				return ++i;
			}
		}

		return -1;
	}

}