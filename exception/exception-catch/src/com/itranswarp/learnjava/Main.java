package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String a = "12";
		String b = "x9";
		int c = stringToInt(a);
		int d = stringToInt(b);
		System.out.println(c * d);
	}

	static int stringToInt(String s) {
		int i = 0;
		try {
			i = Integer.parseInt(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
}
