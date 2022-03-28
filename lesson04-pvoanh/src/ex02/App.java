package ex02;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int[] numbers = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		handleArrays(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	public static void handleArrays(int[] numbers) {
		int d = 0;
		int c = numbers.length-1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 5 == 0  && numbers[i] % 7 == 0) {
				continue;
			}
			if (numbers[i] % 7 == 0) {
				if(numbers[d] %7==0) {
					d++;	
					continue;
				}
				int temp=numbers[d];
				numbers[d++] = numbers[i];
				numbers[i] = temp;
				continue;
			}
			if (numbers[i] % 5 == 0) {
				if(numbers[c] %5==0) {
					c--;
					continue;
				}
				int temp=numbers[c];
				numbers[c--] = numbers[i];
				numbers[i] = temp;
				continue;
			}
			
			
			
		}
	}
}
