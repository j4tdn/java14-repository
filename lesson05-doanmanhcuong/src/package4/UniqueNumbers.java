package package4;

import java.util.Arrays;

public class UniqueNumbers {
	public static void main(String[] args) {
		int[] arr = { 3, 15, 21, 0, 15, 17, 21 };
		for (int j = 0; j < arr.length; j++) {
			int count1 = 0;
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == arr[j]) {
					count1++;
				}
			}
			if (count1 == 1) {
				System.out.print(arr[j] + " ");
			}
		}
	}
}
