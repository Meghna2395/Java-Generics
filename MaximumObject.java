package com.bridzelabz.javagenerics;

import java.util.Scanner;

public class MaximumObject <T extends Comparable<T>>{

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {

		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.println("" + x + " " + y + " " + z + " " + max);
	}

	public static void main(String[] args) {

		MaximumObject maximumobject1 = new MaximumObject();
		maximumobject1.maximum(58, 12, 13);

		MaximumObject maximumobject = new MaximumObject();
		maximumobject.maximum(2.5f, 1.2f, 2.3f);

		MaximumObject maximumobject2 = new MaximumObject();
		maximumobject2.maximum("Apple", "Peach", "Banana");

	}

}
