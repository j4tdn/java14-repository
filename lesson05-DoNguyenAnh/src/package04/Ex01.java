package package04;

import java.util.Arrays;
public class Ex01 {
	public static void main(String[] args) {
		int[] arr = { 3, 15, 21, 0, 15, 17, 21 };
		for (int j = 0; j < arr.length; j++) {
			int counter = 0;
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == arr[j]) {
					counter++;
				}
			}
			if (counter == 1) {
				System.out.print(arr[j] + " ");
			}
		}
	}
}