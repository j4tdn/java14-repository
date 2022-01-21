package io;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		Random rd= new Random();
		String[] customers = {"Laika","Edison","Baca","Boke"};
		
		
		int run = rd.nextInt(customers.length);
		System.out.println("run "+customers[run]);
	}
}
