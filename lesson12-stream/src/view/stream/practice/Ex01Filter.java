package view.stream.practice;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex01Filter {
	public static void main(String[] args) {
		List<Dish> menu =DataModel.getAll();
		
		List<Dish> meatMenu = menu.stream()
				.filter(Dish::isMeat)
				.collect(Collectors.toList());
		meatMenu.forEach(System.out::println);
	}
}
