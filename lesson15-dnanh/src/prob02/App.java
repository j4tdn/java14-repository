package prob02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Bài 2(15đ). Viết chương trình tìm kiếm kí tự có số lần xuất hiện nhiều nhất trong chuỗi.
Nếu tồn tại các ký tự có số lần xuất hiện bằng nhau. In ra các ký tự đó cách nhau bởi dấu
phẩy. Yêu cầu chuỗi chỉ gồm các ký tự trong phạm vi [a-zA-Z]
Ví dụ: input: aaaababbbddc -> output: a
input: aaaaccdcec -> output: a, c
 */
public class App {
	public static void main(String[] args) {
		String input1 = "aaaababbbddc";
		String input2 = "aaaaccdcec";
		System.out.print("input: aaaababbbddc -> output: ");
		longestDigits(input1);
		System.out.print("\ninput: aaaaccdcec -> output: ");
		longestDigits(input2);
	}

	public static void longestDigits(String input) {
		char[] digits = input.trim().toCharArray();
		List<Character> listDigit = new ArrayList<>();
		for (char digit : digits) {
			listDigit.add(digit);
		}
		Map<Character, Long> result = listDigit.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Long appearTheMost = Collections.max(result.values());
		result.forEach((digit, count) -> {
			if (count == appearTheMost) {
				System.out.print(digit + ", ");
			}
		});
	}
}