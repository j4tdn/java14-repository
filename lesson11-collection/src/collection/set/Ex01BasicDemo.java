package collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// Set<Integer> uniqueElements = new HashSet<>();
		// Set<Integer> uniqueElements = new LinkedHashSet<>();
		Set<Integer> uniqueElements = new TreeSet<>(Comparator.reverseOrder());
		uniqueElements.add(2);
		uniqueElements.add(22);
		uniqueElements.add(6);
		uniqueElements.add(8);
		uniqueElements.add(4);
		uniqueElements.add(44);
		uniqueElements.add(10);
		
		System.out.println("size: " + uniqueElements.size());
		
		for (Integer element: uniqueElements) {
			System.out.print(element + "  ");
		}
	}
}
