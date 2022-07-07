package utils;

import java.util.List;

import bean.Item;

public class CollectionUtils {
	private CollectionUtils() {
		// TODO Auto-generated constructor stub
	}
	public static void printo(List<Item> items) {
		items.forEach(System.out::println);
	}
}
