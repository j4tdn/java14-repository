package view.stream.practice;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

// Create a MEAT menu be filtering all MEAT dishes from menu
public class Ex01Filter {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		List<Dish> meatMenu = menu.stream()
				.filter(Dish::isMeat)
				.collect(Collectors.toList());
		meatMenu.forEach(System.out::println);
	}
	/*
	 *  Một lambda có thể viết về 1 method reference khi có 1 static method
	 *  --> sử dụng khi lambda đó quá dài dòng
	 */

}
