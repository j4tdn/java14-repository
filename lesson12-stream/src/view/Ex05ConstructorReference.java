package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import bean.Apple;

public class Ex05ConstructorReference {
	public static void main(String[] args) {
		List<Integer> ids = Arrays.asList(1,3,5,2,4);
		List<Apple> apples = transfer(ids,Apple::new);
		apples.forEach(System.out::println);
	}
	private static <T> List<Apple> transfer(List<T> ids, Function<T, Apple> function){
		List<Apple> apples = new ArrayList<>();
		for(T id : ids ) {
			apples.add(function.apply(id));
		}
		return apples;
	}
}
