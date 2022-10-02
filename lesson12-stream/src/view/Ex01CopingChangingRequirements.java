package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.ApplePredicate;
import model.DataModel;

public class Ex01CopingChangingRequirements {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		List<Apple> applesByColor = filterApples(inventory, apple -> "green".equals(apple.getColor()));
		List<Apple> applesByWeight = filterApples(inventory, apple -> apple.getWeight() > 300);
		
		for(Apple apple: applesByColor) {
			System.out.println(apple);
		}
		
		System.out.println("=============");
		
		for(Apple apple: applesByWeight) {
			System.out.println(apple);
		}
	}
	
	private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
		List<Apple> output = new ArrayList<>();
		for(Apple apple: inventory) {
			if (predicate.test(apple)) {
				output.add(apple);
			}
		}
		return output;
	}
}