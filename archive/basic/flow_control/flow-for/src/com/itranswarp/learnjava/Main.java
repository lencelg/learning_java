package com.itranswarp.learnjava;

/**
 * for练习
 */
public class Main {

	public static void main(String[] args) {
		double pi = 0;
		int n = 1;
		for (int i = 1; i < 100000; i += 2) {
			pi += 1.0 / i * n; 
			n *= -1;
		}
		pi *= 4;
		System.out.println(pi);
	}

}
