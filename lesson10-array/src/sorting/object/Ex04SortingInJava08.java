package sorting.object;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;

import bean.Item;
import utils.ArrayUtils;

public class Ex04SortingInJava08 {
	public static void main(String[] args) {
		Item[] items = mockData();
		
		// Sorting ASC|DESC by properties(id)
		
		// Step1: Using lambda
		Arrays.sort(items, (c1, c2) -> {
			return c1.getId().compareTo(c2.getId());
		});
		
		/*
		public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
	            Function<? super T, ? extends U> keyExtractor)
	    {
	        Objects.requireNonNull(keyExtractor);
	        return (Comparator<T> & Serializable)
	            (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
	            (c1, c2) -> c1.getId().compareTo(c2.getId());
	    }
	    */
		
		// Step2: Using Comparator available function ==> Method Reference
		// Function<Item, Double> keyExtractor = item -> item.getPrice();
		// Function<Item, Double> keyExtractor = Item::getPrice;
		Arrays.sort(items, Comparator.comparing(Item::getPrice));
		
		ArrayUtils.printf(items);
	}
	
	private static Item[] mockData() {
		return new Item[] {
			new Item(102, "Item A", 100d),	
			new Item(174, "Item Z", 180d),	
			new Item(130, "Item C1", 120d),
			new Item(130, "Item C2", 180d),
			new Item(130, "Item C3", 140d),
			new Item(108, "Item A2", 220d)	
		};
	}
}
