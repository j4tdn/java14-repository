package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import bean.Apple;

public class Ex05ConstructorReference {
	public static void main(String[] args) {
		List<Integer> ids = Arrays.asList(1, 2, 3);
		List<String> countries = Arrays.asList("Viet Nam", "Thai Lan", "Singapo");

		// a -> a.getId(); <==> Class::getProperty
		// id -> new Apple(id); <==> Class::new

		List<Apple> firstList = transferToApples(ids, Apple::new);
		firstList.forEach(System.out::println);

		System.out.println("=======================");

		List<Apple> secondList = transferToApples(countries, Apple::new);
		secondList.forEach(System.out::println);

		System.out.println("=======================");

		List<Apple> thirdList = transferToApple(ids, countries, Apple::new);
		thirdList.forEach(System.out::println);

	}

	private static <T> List<Apple> transferToApples(List<T> ts, Function<T, Apple> function) {
		List<Apple> inventory = new ArrayList<>();
		for (T t : ts) {
			// Apple apple = function.apply(t);
			inventory.add(function.apply(t)); // t --> R Function<T, R>
		}
		return inventory;
	}

	private static <T, U> List<Apple> transferToApple(List<T> ts, List<U> us, BiFunction<T, U, Apple> bif) {
		List<Apple> inventory = new ArrayList<>();
		for (int i = 0; i < ts.size(); i++) {
			Apple apple = bif.apply(ts.get(i), us.get(i)); //id, coutries -> BiFunction<T, U, R>
			inventory.add(apple);
		}
		return inventory;
	}
}
