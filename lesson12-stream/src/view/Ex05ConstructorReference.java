package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import bean.Apple;

public class Ex05ConstructorReference {
	public static void main(String[] args) {
		List<Integer> ids = Arrays.asList(1,2,3);
		List<String> countries = Arrays.asList("Viet Nam", "Thai Lan", "Singapo");
		// a  -> a.getId()      <==> Apple::getId
		// id -> new Apple(id)  <==> Apple::new --> hiện tại đang gọi đến hàm khởi tạo 1 tham số
		// tự tìm đến hàm constructor phù hợp
		List<Apple> firstList = transferToApples(ids, Apple::new);
		firstList.forEach(System.out::println);
		
		System.out.println("==================");
		
		// country -> new Apple(country)  <==> Apple::new
		List<Apple> secondList = transferToApples(countries, Apple::new);
		secondList.forEach(System.out::println);
		
		System.out.println("==================");
		
		// (id, country) -> new Apple(id, country) <==> Apple::new
		List<Apple> thirdList = transferToApples(ids, countries, Apple::new);
		thirdList.forEach(System.out::println);
	}
	
	private static <T> List<Apple> transferToApples(List<T> ts, Function<T, Apple> function) {
		List<Apple> inventory = new ArrayList<>();
		for (T t: ts) {
			inventory.add(function.apply(t)); // t --> R Function<T, R>
		}
		return inventory;
	}
	
	private static <T, U> List<Apple> transferToApples(List<T> ts, List<U> us, BiFunction<T, U, Apple> bif) {
		List<Apple> inventory = new ArrayList<>();
		for (int i = 0; i < ts.size(); i++) {
			Apple apple = bif.apply(ts.get(i), us.get(i)); // id, ct --> BiFunction<T, U, R>
			inventory.add(apple);
		}
		return inventory;
	}
}