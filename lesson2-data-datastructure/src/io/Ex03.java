package io;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		String[] customers = {"Laika","Edin","Thanh","Boke"};
		Random rd = new Random();
		int luckyIndex =rd.nextInt(customers.length);
		System.out.println("Lucky draw: "+ customers[luckyIndex]);
	}
}
