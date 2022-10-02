package collection.list;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Ex01RawTypes {
	public static void main(String[] args) {
		// Using code from version prior to 1.4
		// store list of birth year -> number
		
		// raw type, has no constraint
		List list = new ArrayList<>();
		
		list.add(1990);
		list.add(1989);
		list.add(1999);
		list.add(1980);
		list.add("abc");
		
		
		int currentYear = Year.now().getValue();
		
		for(Object object: list) {
			System.out.println("Year of birth: " + object);
			// may cause class cast error at runtime
			// lúc compile thì nó là kiểu Object nhưng khi runtime thì là kiểu int
			System.out.println("Age: " + (currentYear - (int)object));
		}
		
		
		
	}
}
/*
 * Mỗi phần tử yêu cầu List phải là List một kiểu dữ liệu cụ thể nào đó
 * 
 */