package com.bridzelabz.javagenerics;

import java.util.Scanner;

public class MaximumObject {

	public int maxi(int a, int b, int c) {
		int max = a;

		if (b > max) {
			max = b;

			if (c > max) {
				max = c;

			}
		}
		printmaxi(a, b, c, max);
		return max;

	}

	public static void printmaxi(int a, int b, int c, int maxi) {
		System.out.println(a + " " + b + " " + c + " " + maxi);
	}

	public static void main(String[] args) {
		MaximumObject maximum = new MaximumObject();

		maximum.maxi(58, 12, 13);

	}
}
