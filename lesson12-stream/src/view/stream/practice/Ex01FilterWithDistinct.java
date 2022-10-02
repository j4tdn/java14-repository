package view.stream.practice;

import static utils.PredicateUtils.distinctByKey;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Apple;
import bean.Dish;
import model.DataModel;

public class Ex01FilterWithDistinct {
	public static void main(String[] args) {
		// distinct: 1,2,3,4,5
		// unique: 3,5
		List<Integer> digits = Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5);
		System.out.println("Case 1:");
		List<Integer> d1 = digits.stream()
				                 .distinct()	// hashing
				                 .collect(Collectors.toList());
	
		d1.forEach(digit -> System.out.print(digit + " "));
		
		System.out.println("\nCase 2:");
		Set<Integer> d2 = digits.stream()
                .collect(Collectors.toSet());
		d2.forEach(digit -> System.out.print(digit + " "));
	
		System.out.println("\n=================");
		// những món ăn nào cùng lượng calories thì sẽ được loại bỏ
		// override hashcode, equals by calories
		// distinct = filter by non duplicate elements
		List<Dish> menu = DataModel.getDishes();
		menu.stream().distinct()
			.forEach(System.out::println);
		
		// distinct by kind(key/property)
		// nếu hắn chưa tồn tại trong cái mới thì đưa vô 
		
		/*
		 * tạo một cái Set<Kind> 
		 * nếu hắn chưa tồn tại trong menu thì hắn add được
		 */
		System.out.println("=================");
		
		menu.stream().filter(distinctByKey(dish -> dish.getKind()))
			.forEach(System.out::println);
		
		System.out.println("=================");
		List<Apple> inventory = DataModel.getApples();
		inventory.stream().filter(distinctByKey(Apple::getCountry))
		         .forEach(System.out::println);;
		
	}
	
}
