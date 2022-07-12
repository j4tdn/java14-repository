package utils;

import java.util.List;

import bean.Item;

public class CollectionUtils {
	private CollectionUtils() {

	}
	
	public static void printo(List<Item> items) {
		for (Item item : items) {
			System.out.println(item);
		}
	}

	public static void printf(List<String> elements) {
		for (String element : elements) {
			System.out.println(element);
		}
	}

	public static void print(List<Integer> addAllResult) {
		for (Integer element : addAllResult) {
			System.out.println(element);
		}
	}
}
