package view.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex01FirstDishDemo {
	public static void main(String[] args) {
		List<Dish> dishes = DataModel.getDishes();
		
		// Why we collect to list after manipulate data? 
		// Why don't we keep data in the stream at the moment?
		
		// 1. Get dishes which have calories > 250
		// filter(Predicate)
		List<Dish> dishesByCalories = dishes.stream() 		// Stream<Dish>
				.filter(dish -> dish.getCalories() > 250) 	// Stream<Dish>
				.collect(Collectors.toList()); 				// List<Dish>
		dishesByCalories.forEach(System.out::println);

		System.out.println("=======================");
		
		// 2. Get name dishes's name
		// map(Function<T, R>)
		Set<String> dishesName = dishes.stream()					// Stream<Dish>
										.map(Dish::getName)			// Stream<String>
										.collect(Collectors.toSet());
		dishesName.forEach(System.out::println);
		
		System.out.println("=======================");
		
		// 3. Get name of dishes which are vegie food 
		List<String> vegieDishes = dishes.stream() // Stream<Dish>
			  .filter(dish -> dish.isVegetarian()) 	// Stream<Dish>
			  .map(Dish::getName)					// Stream<String>
			  .collect(Collectors.toList());		// Stream<String>
		vegieDishes.forEach(System.out::println);
	}
}