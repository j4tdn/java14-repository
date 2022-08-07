package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.ApplePredicate;
import model.DataModel;

public class Ex01CopingChangingRequirements {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		List<Apple> appleByColor = filterApples(inventory, apple ->"green".equals(apple.getColor()));
		appleByColor.forEach(System.out::println);
		System.out.println("==========================");
		List<Apple> appleByWeight = filterApples(inventory, apple ->apple.getWeight()>300);
		appleByWeight.forEach(System.out::println);
	}
	
	private static List<Apple> filterApples(List<Apple> inventory,ApplePredicate predicate){
		List<Apple> rs = new ArrayList<>();
		for(Apple  apple : inventory) {
			if(predicate.test(apple)) {
				rs.add(apple);
			}
		}
		return rs;
	}
}
