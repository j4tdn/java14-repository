package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex04MethodReference {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		transferCountry(inventory).forEach(System.out::println);
		transfer(inventory, a ->a.getId()).forEach(System.out::println);
	}
	private static <R> List<R> transfer(List<Apple> inventory, Function<Apple, R> function){
		List<R> result = new ArrayList<>();
		inventory.forEach(i -> result.add(function.apply(i)));
		return result;
	}
	/**
	 * List of countries from inventory
	 * @param inventory
	 * @return
	 */
	private static List<String> transferCountry(List<Apple> inventory){
		List<String> countries = new ArrayList<>();
		inventory.forEach(i -> countries.add(i.getCountry()));
		return countries;
	}
}
