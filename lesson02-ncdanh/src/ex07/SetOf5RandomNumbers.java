package ex07;

import java.util.Random;

public class SetOf5RandomNumbers {
	public static final int BOUND_MIN = 20;
	public static final int BOUND_MAX = 30;

	public static void main(String[] args) {
		int length = BOUND_MAX - BOUND_MIN + 1;
		int[] a = new int[length];
		int arrayValue = BOUND_MIN;
		
		for (int i = 0; i < length; i++) {
			a[i] = arrayValue;
			arrayValue++;
		}

		Random rand = new Random();

		for (int i = 0; i < length; i++) {
			int randomIndex = rand.nextInt(length);
			int temp = a[randomIndex];
			a[randomIndex] = a[i];
			a[i] = temp;
		}

		for (int i = 0; i < 5; i++) {
			if (i < 4)
				System.out.print(a[i] + ", ");
			else
				System.out.println(a[i]);
		}
	}

}
