package collection.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		Set<Integer> uniqueEs= new HashSet<>();
		uniqueEs.add(2);
		uniqueEs.add(6);
		uniqueEs.add(8);
		uniqueEs.add(4);
		uniqueEs.add(10);
		uniqueEs.add(22);
		
		
		
		
		System.out.println("size "+uniqueEs.size());
		for(Integer e : uniqueEs) {
			System.out.println(e + " ");
		}
	}
}
