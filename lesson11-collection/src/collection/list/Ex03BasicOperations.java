package collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import utils.CollectionUtils;

public class Ex03BasicOperations {
	public static void main(String[] args) {
		
		// ArrayList = Array + Dynamic Size + Operations
		List<String> sequencse = new ArrayList<>();
		/*
		 * nó sẽ có một khái niệm gọi là Capacity có nghĩa là:
		 * một lần mình add thì nó sẽ kiểm tra xem đã vượt quá Capacity hay chưa
		 * nếu chưa vượt quá thì chỉ cần đưa vào thôi 
		 * còn nếu đã vượt quá thì nó mới copy và tạo mảng mới
		 * idea này giúp mình giảm thiểu tạo mảng mới quá nhiều lần
		 * 
		 * --> câu hỏi phỏng vấn: nêu ra sự khác biệt giữa một lần add 1 phần tử mới 
		 * vào mảng khác j so với add một phần tư vào ArrayList (hiểu khái niệm Capacity)
		 * 
		 * capacity >= length, size(elements exists in elementData)
		 *----------------------------
		 * best practice: when we know max element store in list 
		 *--> call constructor with initialCapacity to reduce create, copy elementData to new one 
		 */
		
		sequencse.add("A");
		sequencse.add("B");
		sequencse.add("C");
		
		sequencse.add(2,"B1");
		List<String> text = new ArrayList<>();
		text.add("M");
		text.add("N");
		text.add("O");
		text.add("P");
		sequencse.addAll(text);		
		// mặc định là add vào cuối
		System.out.println("size: " + sequencse.size());
		CollectionUtils.printf(sequencse);
		
		// GET, SET operation 
		text.set(0, "M1");
		System.out.println("Index 0: " + text.get(0));
		
		// ITERATE --> FOR-EACH|INDEX
		Iterator<String> iterator = sequencse.iterator();
		while(iterator.hasNext()) {
			String value = iterator.next();
			System.out.println("\n"+ value);
		}
		
		// REMOVE
		text.remove(1);
		text.remove("O");
		text.removeIf(element ->element.startsWith("M"));
		System.out.println("=================");
		CollectionUtils.printf(text);
		
		// CONTAIN
		System.out.println("text contains O ? " + text.contains("O"));
		
		// INDEXOF trả về phần tử xuất hiện đầu tiên của phần tử trong ArrayList
		
	}
}
