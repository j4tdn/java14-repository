package view.stream.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;
import utils.PredicateUtils;

public class Ex01FilterWithDistinct {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1,1,2,2,3,4,4,5);
		digits.stream()
		.distinct()   // toSet
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		DataModel.getAll()
		.stream()
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("distinct by key");
		java.util.Set<Kind> kind = new HashSet();
		DataModel.getAll()
		.stream()
		.filter(dish -> kind.add(dish.getKind()))
		.forEach(System.out::println);
		System.out.println("================");
		DataModel.getAll()
		.stream()
		.filter(PredicateUtils.distinctByKey(dish -> dish.isVegetarian()))
		.forEach(System.out::println);
		
	}
	
}
