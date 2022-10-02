package view;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//import java.util.function.Consumer;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;
/*
	+ Method reference:
	
	+ When you need a method reference, the target reference is placed before the delimiter :: and
	the name of the method is provided after it.
	
	+ For example, Apple::getWeight is a method reference to the method getWeight defined in the
	Apple class. Remember that no brackets are needed because you’re not actually calling the
	method. The method reference is shorthand for the lambda expression (Apple a) ->
	a.getWeight().
 */
public class Ex04MethodReference {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		Set<String> countries = transferToCountry(inventory);
//		countries.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		});
		
		countries.forEach(s -> System.out.println(s));
		System.out.println("=========================");
		
		Set<String> countriesTransfer = transfer(inventory, apple -> apple.getCountry());
		countriesTransfer.forEach(s -> System.out.println(s));
		System.out.println("=========================");
		Set<String> colors = transfer(inventory, /*apple -> apple.getColor()*/Apple::getColor);
		colors.forEach(s -> System.out.println(s));
		System.out.println("==========================");
		Set<Integer> Ids = transfer(inventory, Ex04MethodReference::getAppleId);
		Ids.forEach(System.out::println);
		
	}
	//(Class c):T-> (c.getProperty()):R;
	private static Integer getAppleId(Apple apple) {
		return apple.getId();
	}
	
	/**
	 * List of countries from inventory
	 * @param inventory list of apples
	 * @return list data
	 */
	private static Set<String> transferToCountry(List<Apple> inventory){
		Set<String> countries = new HashSet<>();
		for(Apple apple: inventory) {
			countries.add(apple.getCountry());
		}
		return countries;
	}
	// Apple --> String(country)
	// Strategy pattern: String nameMethod(Apple)
	// Generic: R nameMethod(T)
	
	
	// R là kiểu trả về sau khi mapping qua 
	private static <Element,R> Set<R> transfer(List<Element> elements, Function<Element, R> function){
		Set<R> result = new HashSet<>();
		for(Element element: elements) {
			result.add(function.apply(element));
		}
		return result;
	}
	
	
}
