package view.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

import bean.Dish;
import model.DataModel;

public class Ex04Reduce {
	public static void main(String[] args) {
		// 1. find the sum of n integers
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		// case1:
		int sum1 = numbers.stream()
			   .reduce(0, new BinaryOperator<Integer>() {
				   @Override
				   //manipulate the apply function according to the requirements of the problem
				public Integer apply(Integer prev, Integer next) {
					return prev + next;
				}
			});
		// case2:
		int sum2 = numbers.stream().reduce(0,Integer::sum);
		System.out.println("sum1 = " + sum1 +", sum2 = " + sum2);
		// 2. find min max value in array
		System.out.println("=====================");
		
		int  min = numbers.stream().reduce(Integer.MAX_VALUE, (previous, next) -> previous < next ? previous : next );
		int  max = numbers.stream().reduce(Integer.MIN_VALUE, (previous, next) -> previous > next ? previous : next );
		
		System.out.println("min : " + min + ", max :" + max);
		// 3. find the total number of calories in the menu
		List<Dish> menu = DataModel.getDishes();
		
		double sumOfCalories = menu.stream()
			.map(Dish::getCalories)
			.reduce(0d, Double::sum);
		System.out.println("sum of calories: " + sumOfCalories);
		
		// tìm đĩa thức ăn có lượng calories nhỏ nhất
		
		Optional<Dish> optMinCaloriesDish = menu.stream()
			.reduce((d1, d2) -> {
				return d1.getCalories() < d2.getCalories() ? d1 : d2;
			});
		optMinCaloriesDish.ifPresent(
				minCaloriesDish -> {
					menu.stream()
						.filter(dish -> dish.getCalories() == (minCaloriesDish.getCalories()))
						.forEach(System.out::println);
				}
			);
		
	}
}
