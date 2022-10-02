package bai1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exercise01 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);

		List<Integer> list2 = Arrays.asList(5, 7, 9, 10, 20, 9, 7, 7, 11);

		Map<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < list1.size(); i++) {
			addElement(map, list1.get(i));
		}

		Map<Integer, Integer> map2 = new TreeMap<>();
		for (int i = 0; i < list2.size(); i++) {
			addElement(map2, list2.get(i));
		}

		// print số lần xuất hiện của các phần tử
		print(map, 1);

		print(map2, 2);

	}

	private static void addElement(Map<Integer, Integer> map, int element) {
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
				if (map.get(key) == n) {
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
