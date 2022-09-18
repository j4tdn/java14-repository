package view.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import bean.Dish;
import model.DataModel;

public class Ex04Reduce {
	public static void main(String[] args) {
		// Tìm tổng n số nguyên
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		/*
		 * T reduce(T identity, BinaryOperator<T> accumulator);
		 * 
		 * T result = identity; 0 
		   for (T element : this stream) 
		   		result = accumulator.apply(result, element) 
		   return result;
		 */
		int sum = numbers.stream().reduce(0, (prev, next) -> prev + next);
		int min = numbers.stream().reduce(Integer.MAX_VALUE, Integer::min);
		int max = numbers.stream().reduce(Integer.MIN_VALUE, (prev, next) -> prev > next ? prev : next);

		System.out.println("sum: " + sum);
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		
		System.out.println("======================");
		// Tìm tổng lượng calories của các dĩa thức ăn trong menu 
		List<Dish> menu = DataModel.getDishes();
		double sumOfCalories = menu.stream()
				.map(Dish::getCalories)
				.reduce(0d,Double::sum);
		System.out.println("sumOfCalories: " + sumOfCalories);

		// Tìm đĩa thức ăn có lượng calories nhỏ nhất
		Optional<Dish> optMinCaloriesDish = menu.stream()
				.reduce((d1, d2) ->  d1.getCalories() < d2.getCalories() ? d1 : d2);
		
		optMinCaloriesDish.ifPresent(
				minCaloriesDish -> {
					menu.stream().filter(dish -> dish.getCalories() == minCaloriesDish.getCalories())
					.forEach(System.out::println);;
				}
	);
	}	
}
