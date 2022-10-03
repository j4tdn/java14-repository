package ex01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Integer n = 0;
		System.out.print("Enter n: ");
		n = sc.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		/**
		 * Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N Ví dụ: input:
		 * 1 2 3 4 5 6 5 5 3 1  output: 2 4 6
		 */
		Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((k, v) -> {
					if (v == 1) {
						System.out.println(k);
					}
				});
		System.out.println("===============================================");

		/**
		 *  Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N Ví dụ: input: 5 7 9
		 * 10 20 9 7 7 11  output: 7 9
		 */
		Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.forEach((k, v) -> {
			if (v > 1) {
				System.out.println(k);
			}
		});
	}
}
