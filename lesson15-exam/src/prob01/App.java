package prob01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
 Bài 1(15đ): Cho dãy N (0 <= N < 100) phần tử. Mỗi phần tử N[i] (1 <= N[i] <= 20) là
 một số nguyên. Yêu cầu: Mỗi câu không được quá 10 dòng code
 */
public class App {
	public static void main(String[] args) {
		List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);

		Map<Integer, Long> output1 = input1.stream()
				.collect(Collectors.groupingBy(number -> number, Collectors.counting()));

		System.out.println("Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N ");
		output1.forEach((number, count) -> {
			if (count == 1) {
				System.out.print(number + " ");
			}
		});

		List<Integer> input2 = Arrays.asList(5, 7, 9, 10, 20, 9, 7, 7, 11);

		Map<Integer, Long> output2 = input2.stream()
				.collect(Collectors.groupingBy(number -> number, Collectors.counting()));
		System.out.println("\nLiệt kê các phần tử xuất nhiều hơn một lần trong dãy N");
		output2.forEach((number, count) -> {
			if (count > 1) {
				System.out.print(number + " ");
			}
		});
	}
}