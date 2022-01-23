package ex07;

import java.util.Random;

public class RandonNaturalNumber {
	public static void main(String[] args) {
		int count = 1;
		int[] naturalNumber = new int[5];
		while (count <= 5) {
			Random rd = new Random();
			int number = rd.nextInt(11) + 20;
			if (checkRandomNumber(number, naturalNumber)) {
				naturalNumber[count - 1] = number;
				count++;
			}
		}

		showArray(naturalNumber);

	}
	//kiem tra xem da ton tai 1 so trung voi so vua random hay khong
	private static boolean checkRandomNumber(int n, int[] array) {
		for (int i = 0; i < 5; i++) {
			if (n == array[i])
				return false;
		}
		return true;
	}

	private static void showArray(int[] arrays) {
		for (int array : arrays) {
			System.out.print(array + " ");
		}
	}

}
