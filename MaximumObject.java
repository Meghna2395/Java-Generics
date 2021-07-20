package com.bridzelabz.javagenerics;

import java.util.Scanner;

public class MaximumObject<T extends Comparable<T>> {
	T a,b,c;
	
	public MaximumObject(T a, T b, T c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public T maximum() {
		return MaximumObject.maximum(a, b, c);
	}
	
	public static <T extends Comparable<T>> T maximum(T x,T y,T z) {

		T max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
	}

	public static String testMaximum(String p, String q, String r) {
		String max = p;
		if(p.compareTo(max)>0) {
			max = q;
		}
		if(q.compareTo(max)>0) {
			max=r;
		}
		printMax(p,q,r,max);
		return max;
	}
	
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.println(""+x+" "+y+" "+z+" "+max);
	}
	
	public static void main(String[] args) {
		Integer ai=58, bi=12, ci=13;
		Float x=2.5f, y = 1.2f, z= 2.3f;
		String p="Apple", q="Peach", r="Banana";
		
		MaximumObject maxObject = new MaximumObject(ai, bi, ci);
		maxObject.maximum();
		
		MaximumObject maxObject1 = new MaximumObject(x, y, z);
		maxObject1.maximum();
		
		MaximumObject maxObject2 = new MaximumObject(p, q, r);
		maxObject2.maximum();
	}

}
