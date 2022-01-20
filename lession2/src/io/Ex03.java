package io;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		String[] customer = {"Laika", "Edin","Batona", "Boke"};
		Random rd = new Random();
		
		int luckyIndex = rd.nextInt(customer.length);
		System.out.println("Lucky draw : " + customer[luckyIndex]);
	}

}
