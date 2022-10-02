package package01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);

		List<Integer> input2 = Arrays.asList(5, 7, 9, 10, 20, 9, 7, 7, 11);

		Map<Integer, Integer> m1 = new TreeMap<>();
		for (int i = 0; i < input1.size(); i++) {
			countElementSingle(m1, input1.get(i));
		}

		Map<Integer, Integer> m2 = new TreeMap<>();
		for (int i = 0; i < input2.size(); i++) {
			countElementSingle(m2, input2.get(i));
		}

		print(m1, 1);
		
		System.out.println("\n==================");

		print(m2, 2);

	}

	private static void countElementSingle(Map<Integer, Integer> map, int element) {
		if (map.containsKey(element)) {
			int count = map.get(element) + 1;
			map.put(element, count);
		} else {
			map.put(element, 1);
		}
	}

	private static void print(Map<Integer, Integer> map, int n) {
		for (Integer key : map.keySet()) {
			if (n == 1) {
				if (map.get(key) == n ) {
					System.out.print(key + " ");
				}
			} else {
				if (map.get(key) >= n) {
					System.out.print(key + " ");
				}
			}
		}
	}

}