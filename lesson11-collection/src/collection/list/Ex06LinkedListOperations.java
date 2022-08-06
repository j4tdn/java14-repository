package collection.list;

import java.util.LinkedList;
import java.util.List;

public class Ex06LinkedListOperations {
	public static void main(String[] args) {
		List<String> elements = new LinkedList<>();
		
		elements.add("hello");
		elements.add("how are you");
		
		System.out.println("size: " + elements.size());
	}
}
