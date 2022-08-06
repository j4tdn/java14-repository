package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Dish;
import model.DataModel;

public interface Ex03Operations {
	public static void main(String[] args) {
		List<Dish> dishes = DataModel.getDishes();
		
		// Why we collect to list after manipulate data ?
		// Why don't we keep data in the stream at the moment ?
		// --> Stream traversable once
		
		// 3. Get name of dishes which are vegie food
		Stream<String> vegieDishes = dishes.stream()   // Stream<Dish>
				.filter(dish -> {
					System.out.println("testing");
					return dish.isVegetarian();
				}) // Stream<Dish>
				.map(Dish::getName);               // Stream<String>
		
		vegieDishes.forEach(System.out::println);
	}
}
