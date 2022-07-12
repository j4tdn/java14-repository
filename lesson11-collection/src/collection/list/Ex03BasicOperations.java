package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import utils.CollectionUtils;

public class Ex03BasicOperations {
	public static void main(String[] args) {
		// ArrayList = Array + Dynamic Size + Operations

		List<String> sequences = new ArrayList<>();
		// List has an attribute --> Object[] elementData
		// B1: Initial an empty array of objects --> elementData, length = 0
		// capacity >= length, size(elements exists in elementData)
		// best practice: when we know max element store in list
		// --> call constructor with initialCapacity to reduce create, copy elementData
		// to new one
		sequences.add("A");
		sequences.add("B");
		sequences.add("C");
		sequences.add("D");
		sequences.add(2, "B1");

		List<String> text = new ArrayList<String>();
		text.add("M");
		text.add("N");
		text.add("O");
		text.add("P");
		text.add("M2");
		text.add("M3");
		text.add("N1");
		text.add("N2");

		// sequences.addAll(text);

		System.out.println("size:" + sequences.size());
		CollectionUtils.printf(sequences);

		// GET, SET operation
		text.set(0, "M1");
		System.out.println("Index 0: " + text.get(0));

		// ITERATE --> FOR-EACH|INDEX
		Iterator<String> iterator = sequences.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println("value: " + value);
		}
		
		System.out.println("============= REMOVE ===========");
		
		// REMOVE
		// text --> M1, N, O, P
		text.remove(1);
		text.remove("P");
		text.removeAll(sequences);
		text.removeIf(element -> element.startsWith("M"));
		CollectionUtils.printf(text);
		
		// CONTAIN
		System.out.println("text index of M2: " + text.indexOf("M2"));
		
		System.out.println("text contains O "+ text.contains("O"));
		
		
	}
}
