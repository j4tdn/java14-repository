package ex07;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int count = 1;
		int[] arrays = new int[5];
		while (count <= 5) {
			Random rd = new Random();
			int number = rd.nextInt(11) + 20;
			if (isExist(number, arrays)) {
				arrays[count - 1] = number;
				count++;
			}
		}
		for (int array : arrays) {
			System.out.print(array + " ");
		}

	}

	private static boolean isExist(int n, int[] array) {
		for (int i = 0; i < 5; i++) {
			if (n == array[i])
				return false;
		}
		return true;
	}

}