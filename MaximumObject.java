package com.bridzelabz.javagenerics;

import java.util.Scanner;

public class MaximumObject{

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

	public float maxf(float x, float y, float z) {

		float max1 = x;

		if (y > max1) {
			max1 = y;

			if (z > max1) {
				max1 = z;

			}
		}
		printmaxf(x, y, z, max1);
		return max1;

	}
	
	public String maxs(String p, String q, String r) {
		String maxs = p;
		if(p.compareTo(maxs)>0) {
			maxs = q;
		}
		if(q.compareTo(maxs)>0) {
			maxs=r;
		}
		printmaxs(p,q,r,maxs);
		return maxs;
	}

	public static void printmaxf(float x, float y, float z, float max1) {
		System.out.println(x + " " + y + " " + z + " " + max1);
	}

	public static void printmaxi(int a, int b, int c, int maxi) {
		System.out.println(a + " " + b + " " + c + " " + maxi);
	}
	public static void printmaxs(String p, String q, String r, String maxs) {
		System.out.println(p + " " + q + " " + r + " " + maxs);
	}


	public static void main(String[] args) {
		MaximumObject maximum = new MaximumObject();
		maximum.maxf(2.5f, 1.2f, 2.3f);
		maximum.maxi(58, 12, 13);
		maximum.maxs("Apple", "Peach", "Banana");

	}
}
