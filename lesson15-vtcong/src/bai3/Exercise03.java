package bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise03 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 7, 10, 13, 19, 23, 28, 4, 52);
		for (Integer integer : number) {
			System.out.println(integer + " co phai la so happy hay khong : " + (isHappyNumber(integer)? "true" : "false"));
		}

	}

	private static boolean isHappyNumber(int n) {
		List<Integer> listDigit = digit(n);
		int sum = 0;
		sum = calculateSum(listDigit);
		int count = 0;
		while (sum != 1 && count != 100) {
			List<Integer> list = digit(sum);
			sum = calculateSum(list);
			count++;
			if(count == 100) {
				return false;
			}
		}
		return true;
	}

	private static List<Integer> digit(int n) {
		List<Integer> digit = new ArrayList<>();
		while (n != 0) {
			digit.add(n % 10);
			n = n / 10;
		}
		return digit;
	}

	private static int calculateSum(List<Integer> digit) {
		int sum = 0;
		for (Integer integer : digit) {
			sum += integer * integer;
		}
		return sum;
	}
}
