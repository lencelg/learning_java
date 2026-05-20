package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt() - 1;
		scanner.close();
		// 计算机随机数 1, 2, 3:
		int random = (int) (Math.random() * 3);

		int method = (choice - random + 3) % 3;
		switch (method) {
			case 0:
				System.out.println("draw");
				break;
			case 1:
				System.out.println("you win");
				break;
			case 2:
				System.out.println("you loss");
				break;
		}
	}

}
