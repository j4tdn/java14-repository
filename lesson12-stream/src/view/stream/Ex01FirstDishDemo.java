package view.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex01FirstDishDemo {
	public static void main(String[] args) {
		List<Dish> dishes = DataModel.getDishes();
		// Write a method execute the requirement below:

		System.out.println("1. get dishes which have calories > 250");
		// filter(Predicate)
		List<Dish> dishesByCalories = dishes.stream() // Stream<Dish>
				.filter(dish -> dish.getCalories() > 250) // Return a stream consisting of the elements of this stream
															// that match the given predicate
				.collect(Collectors.toList()); // List<Dish>
		dishesByCalories.forEach(System.out::println);

		System.out.println("2. get name of dishes");
		// map(Function<T, R>)
		Set<String> dishesName = dishes.stream() // Stream<Dish>
				.map(Dish::getName) // Stream<String>
				.collect(Collectors.toSet());
		dishesName.forEach(System.out::println);

		System.out.println("3. get name of dishes which are vegetarian food");
		// Tìm các đĩa thức ăn chay trước xong mới lấy các tên thức ăn ra
		List<String> vegetDish = dishes.stream().filter(dish -> dish.isVegetarian()) // Stream<Dish>
				.map(Dish::getName) // Stream<String>
				.collect(Collectors.toList()); // List<String>
		vegetDish.forEach(System.out::println);
	}
	// why we collect to list after manipulate(vận dụng) data ?

	// why don't we keep data in the stream at the moment ?
}
