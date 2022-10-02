package collection.list;

import java.util.ArrayList;
import java.util.List;

import utils.CollectionUtils;

public class Ex04AddRemoveRetail {
	public static void main(String[] args) {
		List<Integer> one = createList(1,2,3,4,5);
		List<Integer> two = createList(4,5,6,7);
		
		// addAll --> Hợp của các phần tử, không loại bỏ các phần tử trùng nhau
		List<Integer> addAllResult = new ArrayList<>(one);
		addAllResult.addAll(two);		 
		CollectionUtils.print(addAllResult);
		System.out.println("================");
		// removeAll --> Hiệu (những phần tử thuộc one mà không thuộc two)
		List<Integer> removeAllResult = new ArrayList<>(one);
		CollectionUtils.print(removeAllResult);
		System.out.println("================");
		removeAllResult.removeAll(two);
		CollectionUtils.print(removeAllResult);
		// retailAll --> Giao
		System.out.println("============");
		List<Integer> retailAllResult = new ArrayList<>(one);
		retailAllResult.retainAll(two);
		CollectionUtils.print(retailAllResult);
		
	}
	// variable
	// number represent for array of Integer with dynamic length
	// pass --> 1,2,3
	// pass --> 1,2,3
	// pass --> 
	// pass --> 4,6
	// pass --> new int[1,2,3];
	private static List<Integer> createList(Integer ... numbers) {
		List<Integer> result = new ArrayList<>();
		for(Integer number : numbers) {
			result.add(number);
		}
		return result;
	}
}
