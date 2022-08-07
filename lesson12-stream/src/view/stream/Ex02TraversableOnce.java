package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Dish;
import model.DataModel;

public class Ex02TraversableOnce {
	public static void main(String[] args) {
		List<Dish> dishes = DataModel.getAll();
		Stream<Dish> stream =dishes.stream();
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
	}
}
