package Ex02;

import java.util.Arrays;

/**
 * 
 * Viết chương trình gom các số chia hết cho 7 sang trái , chia hết cho 5 sang
 * phải và các số chia hết cho 5 , cho 7 và còn lại ở giữa.
 *
 */

public class AppEx02 {
	public static void main(String[] args) {
		int[] intergernumbers = new int[] { 12, 21, 25, 19, 32, 35, 49, 10, 34, 14, 18 };

		arrangeInt(intergernumbers);
		System.out.println(Arrays.toString(intergernumbers));
	}

	public static void arrangeInt(int[] integerNumber) {
		int counthead = 0;
		int counttail = integerNumber.length - 1;
		for (int i = 0; i < integerNumber.length; i++) {
			int tmp = 0;
			if (integerNumber[i] % 7 == 0 && integerNumber[i] % 5 == 0) {
				continue;
			} else if (integerNumber[i] % 7 == 0) {
				tmp = integerNumber[counthead];
				integerNumber[counthead] = integerNumber[i];
				integerNumber[i] = tmp;
				counthead++;
			} else if (integerNumber[i] % 5 == 0 && i < counttail ) {
				tmp = integerNumber[counttail];
				integerNumber[counttail] = integerNumber[i];
				integerNumber[i] = tmp;
				counttail--;
			}
		}
	}

}
