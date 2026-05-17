package com.itranswarp.learnjava;

/**
 * Is primary student?
 */
public class PrimaryStudent {

	public static void main(String[] args) {
		int age = 7;
		// primary student的定义: 6~12岁
		boolean isPrimaryStudent = 6 <= age && age <= 12; 
		System.out.println(isPrimaryStudent ? "Yes" : "No");
	}

}
