package io;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		String[] customers = {"Laika","Edin","Batona","Boke"};
		Random rd = new Random();
		int luckyIndex = rd.nextInt(customers.length);
		System.out.println("Lucky Customter: " + customers[luckyIndex]);
	}
}
