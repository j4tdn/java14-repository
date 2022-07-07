package generic;
import java.util.Arrays;
import java.util.List;

public class Ex02GenericMethodWithCollection {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> points= Arrays.asList(5.6d,8.8d,9.4d);
		List<String> codes =Arrays.asList("IT05","XK12","KT14");
		printf(digits);
		printf(points);
		printfAsWildCard(codes);
	}
	private static <T> void printf(List<T> elements) {
		for(T e : elements) {
			System.out.print(e +" ");
		}
		System.out.println();
	}
	private static <T> void printfAsWildCard(List<? super String> elements) {
		for(Object e : elements) {
			System.out.print(e +" ");
		}
		System.out.println();
	}
}
