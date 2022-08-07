package view.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex04Reduce {
	public static void main(String[] args) {
		// 1. Get sum of list integer
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().reduce(0, (pre, next) -> pre + next);
		int min = numbers.stream().reduce(Integer.MAX_VALUE, (pre,next) -> pre > next ? next:pre);
		int max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("min "+min);
		System.out.println("max " +max);
		System.out.println(sum);
		
		System.out.println("===============");
		
		// tim tong luong calories
		
		List<Dish> menu = DataModel.getAll();
		double sumOfCalories = menu.stream()
			.map(Dish::getCalories)
			.reduce(0d, Double::sum);
		System.out.println(sumOfCalories);
		
		// minCalories
		Optional<Dish> minCalories = menu.stream().reduce((d1,d2)->{
			return d1.getCalories() <d2.getCalories() ?d1:d2;
		});
		List<Dish> minC =  null;
		minCalories.ifPresent(
				minCaloriesGet ->{
					 menu.stream().filter(dish->dish.getCalories()== minCaloriesGet.getCalories())
					.collect(Collectors.toList());
				}
				);
	}
}
