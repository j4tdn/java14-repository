package practice;

import java.util.Random;

public class RandomPassword {
	public static void main(String[] args) {
		int[] passwords = new int[100];
		int count = 0;
		do {
			Random random = new Random();
			int rdPassword = 99 + random.nextInt(900);
			passwords[count] = rdPassword;
			count++;
			if (count > 99) {
				break;
			}
		} while (true);
		for(int password : passwords) {
			System.out.println(password);
		}

	}
}
  