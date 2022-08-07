package view.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex01FirstDishDemo {
	public static void main(String[] args) {
		List<Dish> dishes = DataModel.getAll();
		
		
		// 1. Get dished which have calories >250
		dishes.stream()
			  .filter(d -> d.getCalories() > 400)
			  .collect(Collectors.toList())
			  .forEach(System.out::println);
		System.out.println("================================");
		dishes.stream()
		      .map(Dish::getName)
		      .collect(Collectors.toList())
			  .forEach(System.out::println);
		System.out.println("================================");
		//2 Get name of dishes which are vegetarian food
		dishes.stream()
			  .filter(d -> d.isVegetarian())
			  .map(Dish::getName)
			  .collect(Collectors.toList())
			  .forEach(System.out::println);
	}
}
