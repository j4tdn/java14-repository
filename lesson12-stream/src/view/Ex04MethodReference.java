package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex04MethodReference {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		// Function<T, R>
		// (Class c) -> c.getProperty(); --> Class::getProperty
		Set<String> countries = transfer(inventory, Apple::getCountry);
		countries.forEach(System.out::println);
		
		System.out.println("==================");
		
		Set<String> colors = transfer(inventory, Apple::getColor);
		colors.forEach(s -> System.out.println(s));
		
		System.out.println("==================");
		
		Set<Integer> ids = transfer(inventory, Ex04MethodReference::getAppleId);
		ids.forEach(s -> System.out.println(s));
	}
	
	// (Class c):T -> c.getProperty():R
	private static Integer getAppleId(Apple apple)  {
		return apple.getId();
	}
	
	private static <Element, R> Set<R> transfer(List<Element> elements, Function<Element, R> func) {
		Set<R> result = new HashSet<>();
		for (Element element: elements) {
			result.add(func.apply(element));
		}
		return result;
	}

	/**
	 * List of countries from inventory
	 * 
	 * @param inventory list of apples
	 * @return list data
	 */
	// Apple --> String(country)
	// Strategy: String method(Apple) R method(T)
	private static Set<String> transferToCountries(List<Apple> inventory) {
		Set<String> countries = new HashSet<>();
		for (Apple apple: inventory) {
			countries.add(apple.getCountry());
		}
		return countries;
	}
	
	private static Set<String> transferToColors(List<Apple> inventory) {
		Set<String> countries = new HashSet<>();
		for (Apple apple: inventory) {
			countries.add(apple.getColor());
		}
		return countries;
	}
}
