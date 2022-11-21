package utils;

import java.util.Arrays;

public class Bt1 {
	public static void main(String[] args) {
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c","b", "xx"};
		Arrays.sort(strings, (o1, o2) -> o1.compareTo(o2));
		System.out.println(Arrays.toString(strings));
	}
}
