package collection.list;

import java.util.ArrayList;
import java.util.List;

import utils.CollectionUtils;

public class Ex04AddRemoveRetail {
	public static void main(String[] args) {
		List<Integer> one = createList(1, 2, 3, 4, 5);
		List<Integer> two = createList(4, 5, 6, 7);

		// addAll --> Hợp
		List<Integer> addAllResult = new ArrayList<>(one);
		addAllResult.addAll(two);
		CollectionUtils.print(addAllResult);

		System.out.println("=======================");

		// removeAll --> Hiệu
		List<Integer> removeAllResult = new ArrayList<>(one);
		removeAllResult.removeAll(two);
		CollectionUtils.print(removeAllResult);
		
		System.out.println("=======================");
		
		// retainAll --> Giao
		List<Integer> retainAllResult = new ArrayList<>(one);
		retainAllResult.retainAll(two);
		CollectionUtils.print(retainAllResult);
	}
	// variables
	// numbers represent for array of Integer with dynamic length
	// pass --> 1, 2, 3
	// pass -->
	// pass --> new int[1,2,3];

	private static List<Integer> createList(Integer... numbers) {
		List<Integer> result = new ArrayList<>();
		for (Integer number : numbers) {
			result.add(number);
		}
		return result;
	}
}