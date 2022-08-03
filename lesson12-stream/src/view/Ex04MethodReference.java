package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex04MethodReference {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApple();
		
		// Function<T, R>
		// (Class c) -> c.getProperty(); --> Class::getProperty
		Set<String> countries = transfer(inventory, Apple::getCountry);
		countries.forEach(System.out::println);
		
		System.out.println("=====================");
		
		Set<String> colors = transfer(inventory, Apple::getColor);
		colors.forEach(s -> System.out.println(s));

		System.out.println("=====================");
		
		Set<Integer> ids = transfer(inventory, apple -> apple.getId());
		ids.forEach(s -> System.out.println(s));
		
		// Set<Integer> idss = transfer(inventory, Ex04MethodReference::getAppleId);
		// idss.forEach(s -> System.out.println(s));
		
	} 
	
	private static <Element, R> Set<R> transfer(List<Element> elements, Function<Element, R> func){
		Set<R> result = new HashSet<>();
		for(Element element: elements) {
			result.add(func.apply(element));
		} 
		return result;
	}
	
	// (Class c): T -> c.getProperty(): R
	
	private static Integer getAppleId(Apple apple) {
		return apple.getId();
	}
	
	/**
	 * List of countries from inventory
	 * 
	 * @param inventory
	 * @return
	 */
	
	private static Set<String> transfer(List<Apple> inventory){
		Set<String> countries = new HashSet<>();
		for(Apple apple: inventory) {
			String country = apple.getCountry();
			countries.add(country);
		} 
		return countries;
	}
}
