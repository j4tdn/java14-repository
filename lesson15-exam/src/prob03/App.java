package prob03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 7, 10, 13, 19, 23, 28);
		for (Integer integer : number) {
			System.out.println(integer + (isHappyNumber(integer)? "->là số hạnh phúc" : "->không phải số hạnh phúc"));
		}

	}

	private static boolean isHappyNumber(int n) {
		List<Integer> listDigit = digit(n);
		int sum = 0;
		sum = Sum(listDigit);
		int count = 0;
		while (sum != 1 && count != 100) {
			List<Integer> list = digit(sum);
			sum = Sum(list);
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

	private static int Sum(List<Integer> digit) {
		int sum = 0;
		for (Integer integer : digit) {
			sum += integer * integer;
		}
		return sum;
	}
}
