package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Dish;
import model.DataModel;

public interface Ex02TraversableOnce {
	public static void main(String[] args) {
		List<Dish> dishes = DataModel.getDishes();

		// Why we collect to list after manipulate data ?
		// Why don't we keep data in the stream at the moment ?
		// --> Stream traversable once

		// 3. Get name of dishes which are vegie food
		Stream<String> vegieDishes = dishes.stream() // Stream<Dish>
				                           .filter(dish -> dish.isVegetarian()) // Stream<Dish>
				                           .map(Dish::getName); // Stream<String>
 
		vegieDishes.forEach(System.out::println);
		/*
		 * vì lý do stream chỉ cho phép duyệt một lần nên mình không nên lưu dữ liệu vào trong stream 
		 * nếu mình muốn sử dụng dữ liệu đó cho mục đích khác(lần sử dụng khác)
		 */
		vegieDishes.forEach(System.out::println);
	}
}